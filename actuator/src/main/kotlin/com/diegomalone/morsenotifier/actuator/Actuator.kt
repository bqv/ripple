package com.diegomalone.morsenotifier.actuator

import com.diegomalone.domain.EncodedChar

interface Actuator {

    fun sendCharacter(encodedChar: EncodedChar)

    fun endOfMessage()
}