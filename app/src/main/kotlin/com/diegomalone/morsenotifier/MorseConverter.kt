package com.diegomalone.morsenotifier

import com.diegomalone.morsenotifier.MorseCodeMap.map
import com.diegomalone.morsenotifier.domain.EncodedChar
import com.diegomalone.morsenotifier.domain.SignalLength.PAUSE

fun String.toMorseCode(): List<EncodedChar> {
    val morseCharList = mutableListOf<EncodedChar>()

    this.unaccent().forEach {
        morseCharList.add(it.toMorseCode())
    }

    return morseCharList
}

fun Char.toMorseCode(): EncodedChar {
    val cleanChar = this.toLowerCase()
    return EncodedChar(map[cleanChar] ?: listOf(PAUSE))
}