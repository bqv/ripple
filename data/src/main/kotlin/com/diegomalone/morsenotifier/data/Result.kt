package com.diegomalone.morsenotifier.data

sealed class Result<out T, out R> {
    class Success<out T>(val data: T) : Result<T, Nothing>()
    class Failure<out R : RequestError>(val error: R) : Result<Nothing, R>()

    sealed class State : Result<Nothing, Nothing>() {
        object Loading : State()
        object Loaded : State()
    }

    fun handleResult(
        successBlock: (T) -> Unit = {},
        failureBlock: (R) -> Unit = {},
        stateBlock: (State) -> Unit = {}
    ) {
        when (this) {
            is Success -> successBlock(data)
            is Failure -> failureBlock(error)
            is State -> stateBlock(this)
        }
    }
}