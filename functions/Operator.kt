package com.example.myapplication.functions

/**
 * Overloading
 */

data class Fraction(val numerator: Int, val denominator: Int){
    operator fun plus(add: Fraction) : Fraction {
        return if(denominator == add.denominator){
            Fraction(numerator+add.numerator, denominator)
        }else{
            val commun = denominator * add.denominator
            Fraction(((commun / denominator) * numerator) + ((commun / add.denominator) * add.numerator), commun)
        }
    }

    operator fun inc(): Fraction {
        return this
    }
}

fun main(){
    var f1 = Fraction(3, 2)
    val f2 = Fraction(5, 3)

    println(f1 + f2)
    f1++
}