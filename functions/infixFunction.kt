package com.example.myapplication.functions

/**
 * Infix so funciona quando temos um parametro
 */

class Person(val name: String){
    infix fun isName(value: String): Boolean{
        return value == name
    }
}

infix fun Int.isHalfOf(value: Int) = value / 2 == this

fun main(){
    10.isHalfOf(20)
    10 isHalfOf 30

    val p1 = Person("Marco")
    p1 isName "Marco"
}