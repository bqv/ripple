package com.diegomalone.morsenotifier.data

sealed class RequestError {
    object GenericError : RequestError()
}