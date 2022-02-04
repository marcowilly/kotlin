package com.example.myapplication

fun main(){
    var str = "Marco Willy Azevedo Gomes"
    for(c in str){
        print("$c ")
    }

    for (i in 1..100 step 2){
        if(i != 80)
            print("${i} ")
    }

    for (j in 100 downTo 0){
        print("$j ")
    }
}