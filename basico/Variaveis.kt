package com.example.myapplication.basico

/**
 * Type Bit
 * Double 64 - Ponto flutuante
 * FLoat 32 - Ponto Flutuante
 * Long 64 - Sem ponto flutuante
 * Int 32 - Sem ponto flutuante
 * Short 16 - Sem ponto flutuante
 * Byte 8 - Sem ponto flutuante
 * Boolean ? - true/false
 * String ? - Cadeia de caractes
 * Char ? - Character ex: "A"
 */

/**
 * Lembrando sobre unidades de medida
 * 1 Byte = 8 bits
 * 1 Kilobyte (KB) = 1024 bytes
 * 1 Megabyte (MB) = 1024 kilobytes
 * 1 Gigabyte (GB) = 1024 megabytes
 */

fun printMaxMinValueType(){
    println(String.format("Double: Max: %s - Min: %s", Double.MAX_VALUE, Double.MIN_VALUE))
    println(String.format("Float: Max: %s - Min: %s", Float.MAX_VALUE, Float.MIN_VALUE))
    println(String.format("Long: Max: %s - Min: %s", Long.MAX_VALUE, Long.MIN_VALUE))
    println(String.format("Int: Max: %s - Min: %s", Int.MAX_VALUE, Int.MIN_VALUE))
    println(String.format("Short: Max: %s - Min: %s", Short.MAX_VALUE, Short.MIN_VALUE))
    println(String.format("Byte: Max: %s - Min: %s", Byte.MAX_VALUE, Byte.MIN_VALUE))
}

fun variaveisMutaveis(){
    // Variáveis mutáveis
    var nome = "Marco Willy"
    println("Variavel: $nome")
}

fun variaveisImutaveis(){
    // Variáveis imutáveis
    val idade = 10
    val x: Int = 10

    val caracteristica = " show!"

    //Interpolação de String
    println("Kotlin é uma linguagem ${caracteristica.length}")
}

fun main(){
    printMaxMinValueType()
    variaveisMutaveis()
    variaveisImutaveis()
}