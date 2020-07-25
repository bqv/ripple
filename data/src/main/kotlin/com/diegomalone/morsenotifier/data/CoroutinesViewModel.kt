package com.diegomalone.morsenotifier.data

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

abstract class CoroutinesViewModel : ViewModel(), CoroutineScope {

    private val job = Job()
    protected abstract val receiveChannel: ReceiveChannel<Result<Any, RequestError>>

    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main

    abstract fun resolve(value: Result<Any, RequestError>)

    init {
        processStream()
    }

    private fun processStream() {
        launch {
            receiveChannel.consumeEach {
                resolve(it)
            }
        }
    }

    override fun onCleared() {
        receiveChannel.cancel()
        coroutineContext.cancel()
        super.onCleared()
    }
}