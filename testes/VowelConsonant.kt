package com.example.myapplication.testes

fun countVowels(phrase: String): Int{
    val VOLWES = "aeiou"
    var totalVowels = 0
    for (letter in phrase){
        if(letter.toLowerCase() in VOLWES) totalVowels++
    }
    return totalVowels
}

fun countConsonants(phrase: String): Int{
    val CONSONANTES = "bcdfghjklmnpqrstvwxyz"
    var totalConsonantes = 0
    for (letter in phrase){
        if(letter.toLowerCase() in CONSONANTES) totalConsonantes++
    }
    return totalConsonantes
}

fun countVowelsFilter(phrase: String): Int{
    return phrase.filter { hasLetter(it, "aeiou")}.length
}

fun countConsonantFilter(phrase: String): Int{
    return phrase.filter { hasLetter(it, "bcdfghjklmnpqrstvwxyz")}.length
}

private fun hasLetter(letter: Char, letters: String): Boolean{
    return letters.filter { it.lowercaseChar() == letter.lowercaseChar() }.any()
}