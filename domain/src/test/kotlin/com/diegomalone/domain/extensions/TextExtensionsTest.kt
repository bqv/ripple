package com.diegomalone.domain.extensions

import com.diegomalone.domain.EncodedChar
import com.diegomalone.domain.SignalType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TextExtensionsTest {

    @Test
    fun testClearString() {
        assertEquals("aaaaenouuci", "áãàâéñóûüçî".clearString())
        assertEquals("aaaaenouuci", "ÁÃÀÂÉÑÓÛÜÇÎ".clearString())
        assertEquals("no accent text", "No accent text".clearString())
        assertEquals("!{}[];:<>,.()*&%$#@", "!{}[];:<>,.()*&%$#@".clearString())
    }

    @Test
    fun testCharToMorseCode() {
        assertEquals(EncodedChar(listOf(SignalType.SHORT, SignalType.LONG)), 'a'.toMorseCode())
        assertEquals(null, '%'.toMorseCode())
    }

    @Test
    fun testToMorseCode() {
        val thatOkMorseCode = listOf(
            't'.toMorseCode(),
            'h'.toMorseCode(),
            'a'.toMorseCode(),
            't'.toMorseCode(),
            '\''.toMorseCode(),
            's'.toMorseCode(),
            'o'.toMorseCode(),
            'k'.toMorseCode()
        )
       assertEquals(thatOkMorseCode,"That's Ok".toMorseCode())

        assertEquals(listOf<EncodedChar>(),"".toMorseCode())
        assertEquals(listOf<EncodedChar>(),"%".toMorseCode())
    }

}