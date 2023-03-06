package com.alexo.codes.techvlogcontent.array

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class TwoSumTest {

    // nums = [2,7,11,15], target = 9
    // output = [0, 1]
    @Test
    fun shouldBeEqual_one() {
        assertArrayEquals(intArrayOf(0, 1),
            twoSumBruteForce(intArrayOf(2, 7, 11, 15), 9))
    }

    // Input: nums = [3,2,4], target = 6
    // Output: [1,2]
    @Test
    fun twoSumBruteForce_caseTwo() {
        assertArrayEquals(intArrayOf(1, 2),
            twoSumBruteForce(intArrayOf(3,2,4), 6))
    }

    // Input: nums = [3,3], target = 6
    // Output: [0,1]
    @Test
    fun twoSumBruteForce_caseThree() {
        assertArrayEquals(intArrayOf(0,1),
            twoSumBruteForce(intArrayOf(3,3), 6))
    }

}