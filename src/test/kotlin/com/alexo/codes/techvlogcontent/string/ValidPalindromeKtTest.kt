package com.alexo.codes.techvlogcontent.string

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class ValidPalindromeKtTest {

    @ParameterizedTest
    @ValueSource(strings = ["level", "race car","A man, a plan, a canal: Panama"])
    fun shouldReturnTruePalindrome(str: String) {
        assertTrue(isValidPalindrome(str))
    }

    @ParameterizedTest
    @ValueSource(strings = ["race a car","algorithm"])
    fun shouldReturnNotFalsePalindrome(str: String) {
        assertFalse(isValidPalindrome(str))
    }
}