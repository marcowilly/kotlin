package com.example.myapplication.functions

/**
 * Funções atribuidas a variaveis ou funcoes inline
 */

fun main(){
    operator(2,2, ::sum)
    operator(2, 2, ::multiply)

    val l1 = { x: Int, y: Int -> x + y }
    val l2: (Int, Int) -> Int = l1

    operator(10, 20, l2)
}