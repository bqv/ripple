package com.diegomalone.morsenotifier.actuator

import android.content.Context
import android.widget.Toast
import com.diegomalone.domain.EncodedChar
import com.diegomalone.domain.SignalType

class ToastActuator(private val context: Context) : Actuator {

    private val messageBuilder = StringBuilder()

    override fun sendCharacter(encodedChar: EncodedChar) {
        encodedChar.code.forEach { signal ->
            messageBuilder.append( when (signal) {
                SignalType.SHORT -> ". "
                SignalType.LONG -> "- "
                SignalType.WORD_BREAKER -> "  "
            })
        }

        messageBuilder.append(" ")
    }

    override fun endOfMessage() {
        val message = messageBuilder.toString()
        messageBuilder.clear()

        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}