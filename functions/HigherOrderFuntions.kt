package com.example.myapplication.functions

/**
 * Passa uma função por parametro
 */

fun operator(x: Int, y: Int, op: (Int, Int) -> Int) = op(x, y)

fun sum(x: Int, y: Int) = x+y

fun multiply(x: Int, y: Int) = x*y

fun <T> Iterable<T>.paraCada(op: (T) -> Unit){
    for(i in this){
        op(i)
    }
}

fun main(){
    val list = listOf(1,2,3,4)
    list.forEach { println(it) }
    list.paraCada{ println(it) }

    val strList = listOf("","","")
    strList.paraCada{ println(it) }

    val map = mapOf(Pair("Paris", "França"))
    map.values.paraCada{}

    operator(2,2, ::sum)
    operator(2, 2, ::multiply)
}