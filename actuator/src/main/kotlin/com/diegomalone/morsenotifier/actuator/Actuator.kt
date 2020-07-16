package com.diegomalone.morsenotifier.actuator

import com.diegomalone.morsenotifier.actuator.domain.EncodedChar

interface Actuator {

    fun sendCharacter(encodedChar: EncodedChar)
}