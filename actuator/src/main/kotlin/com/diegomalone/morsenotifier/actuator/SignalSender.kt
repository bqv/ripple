package com.diegomalone.morsenotifier.actuator

import com.diegomalone.domain.extensions.toMorseCode

class SignalSender(private val actuatorList: List<Actuator>) {

    fun sendMessage(message: String) {
        val morseMessage = message.toMorseCode()

        actuatorList.forEach { actuator ->
            morseMessage.forEach { morseChar ->
                actuator.sendCharacter(morseChar)
            }

            actuator.endOfMessage()
        }
    }
}