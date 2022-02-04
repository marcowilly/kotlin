package com.example.myapplication

fun main(){
    var index: Int = 0
    while (index < 100) {
        println("Marco[${index++}]")

        if(index == 50){
            break
        }
    }
}