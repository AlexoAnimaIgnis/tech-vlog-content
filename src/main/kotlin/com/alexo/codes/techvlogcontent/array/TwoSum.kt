package com.alexo.codes.techvlogcontent.array

fun twoSumBruteForce(nums: IntArray, target: Int) : IntArray {
    for(i in nums.indices) {
        var findNum = target - nums[i]

        // nums[i]
        for(j in i+1 until nums.size) {
            if(nums[j] == findNum) {
                return intArrayOf(i, j)
            }
        }
    }

    return intArrayOf()
}