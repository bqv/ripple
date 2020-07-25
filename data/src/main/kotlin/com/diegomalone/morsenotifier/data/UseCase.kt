package com.diegomalone.morsenotifier.data

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

abstract class UseCase<in Params, T> : CoroutineScope {

    private val parentJob = SupervisorJob()
    private val mainDispatcher = Dispatchers.Main
    private val backgroundDispatcher = Dispatchers.Default
    protected val resultChannel = Channel<Result<T, RequestError>>()

    val receiveChannel: ReceiveChannel<Result<T, RequestError>> = resultChannel

    override val coroutineContext: CoroutineContext
        get() = parentJob + mainDispatcher

    protected abstract suspend fun run(params: Params)

    operator fun invoke(params: Params) {
        launch {
            withContext(backgroundDispatcher) {
                run(params)
            }
        }
    }

    protected fun <R> startAsync(block: suspend () -> R): Deferred<R> = async(parentJob) {
        block()
    }
}