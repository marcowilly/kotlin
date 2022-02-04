package com.example.myapplication.functions

/**
 * Anonimous Function
 */

fun main(){
    operator(1, 2, fun (n1: Int, n2: Int) : Int{
        return n1 + n2
    })
}