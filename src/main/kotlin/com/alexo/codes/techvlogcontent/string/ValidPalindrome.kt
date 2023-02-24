package com.alexo.codes.techvlogcontent.string

fun isValidPalindrome(str: String) : Boolean {
    if(str.length <=1) return true

    var s = str.replace("[,:;\\s]".toRegex(), "").lowercase()
    var left = 0
    var right = s.length -1

    while(left < right) {
        if(s[left] != s[right]) return false

        left++
        right--
    }

    return true
}