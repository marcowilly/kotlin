package com.example.myapplication.testes

import org.junit.Assert
import org.junit.Test

class VowelConsonantTest {

    @Test fun countVowels(){
        Assert.assertEquals(11, countVowels("Quantas vogais tem essa frase?"))
    }

    @Test fun countConsonants(){
        Assert.assertEquals(209, countConsonants("Geralmente uma frase possui mais consoantes!"))
    }

    @Test fun countVowelsAndConsonants(){
        var phrase = "Marco Willy"
        Assert.assertEquals(3, countVowels(phrase))
        Assert.assertEquals(7, countConsonants(phrase))
    }

    @Test fun countVowelsFilter() {
        Assert.assertEquals(8, countVowelsFilter("Minha frase com vogais!"))
    }

    @Test fun countConsonantFilter() {
        Assert.assertEquals(11, countConsonantFilter("Minha frase com vogais!"))
    }
}