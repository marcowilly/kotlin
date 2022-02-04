package com.example.myapplication.basico


fun operacoes(){
    println("2 + 2 = ${2+2}")
    println("2 - 2 = ${2-2}")
    println("2 / 2 = ${2/2}")
    println("2 * 2 = ${2*2}")
    println("10 % 4 = ${10%4}")
    println("10 % 2 = ${10%2}")

    var numero = 10
    println("numero++ = ${numero++}")
    println("numero-- = ${numero--}")

    println("++numero = ${++numero}")
    println("--numero = ${--numero}")

    numero += 2
    println("numero += 2 ${numero}")

    numero -= 2
    println("numero -= 2 ${numero}")
    numero /= 2
    println("numero /= 2 ${numero}")
}

fun soma(a: Int, b: Int) : Int = a + b

fun calculaBonus(a: Int, b: Int, c: Int){
    println("O Bônus é ${a + b * c}")
}

fun main(){
    operacoes()
    println("Soma ${soma(20, 40)}")
    calculaBonus(20, 20, 30)
}