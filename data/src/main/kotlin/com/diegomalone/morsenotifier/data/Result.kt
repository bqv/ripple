package com.diegomalone.morsenotifier.data

import androidx.lifecycle.MutableLiveData
import com.diegomalone.morsenotifier.data.Result.Success

sealed class Result<out R> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Failure(val exception: Exception) : Result<Nothing>()
    object Loading : Result<Nothing>()

    override fun toString(): String {
        return when (this) {
            is Success<*> -> "Success[data=$data]"
            is Failure -> "Failure[exception=$exception]"
            is Loading -> "Loading"
        }
    }
}

val Result<*>.succeeded
    get() = this is Success && data != null

fun <T> Result<T>.successOr(fallback: T): T {
    return (this as? Success<T>)?.data ?: fallback
}

val <T> Result<T>.data: T?
    get() = (this as? Success)?.data

inline fun <reified T> Result<T>.updateOnSuccess(liveData: MutableLiveData<T>) {
    if (this is Success && succeeded) {
        liveData.value = data
    }
}