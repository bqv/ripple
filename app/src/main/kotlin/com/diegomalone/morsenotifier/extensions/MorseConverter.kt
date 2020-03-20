package com.diegomalone.morsenotifier.extensions

import com.diegomalone.morsenotifier.domain.MorseCodeMap.map
import com.diegomalone.morsenotifier.domain.EncodedChar
import org.apache.commons.lang3.StringUtils
import java.util.Locale

fun String.toMorseCode(): List<EncodedChar> {
    val cleanString = clearString()
    val morseCharList = mutableListOf<EncodedChar>()

    cleanString.forEach { char ->
        char.toMorseCode()?.let { encodedChar ->
            morseCharList.add(encodedChar)
        }
    }

    return morseCharList
}

private fun String.clearString() =
    StringUtils.stripAccents(this).toLowerCase(Locale.getDefault())

private fun Char.toMorseCode(): EncodedChar? {
    return map[this]?.let {
        EncodedChar(it)
    }
}