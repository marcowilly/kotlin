package com.example.myapplication

fun operadorWhen(a: Int, b: Int, c: String): Int{
    when {
        a > 0 && b > 0 -> {
            println("Variáveis maiores que zero")
        }
    }

    //Range - Intervalo de valores
    when (a) {
        in 1..99 -> {
            println("Século")
        }
    }

    return when (c) {
        "Soma" -> a + b
        "Subtração" -> a - b
        else -> 0
    }
}

fun main(){
    println(operadorWhen(10, 100, "Soma"))
}