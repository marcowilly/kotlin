package com.example.myapplication

import java.text.SimpleDateFormat
import java.util.*

fun log(str: String){
    println(str)
}

fun top(){
    fun log(str: String){
        val calendar = Calendar.getInstance()
        val formatted = SimpleDateFormat("HH:mm:ss")
        print("$str - ${formatted.format(calendar.time)}")
    }
    log("inicio")
    com.example.myapplication.log("")

    val interval = 1..1000000000
    var sum: Double = 0.0
    for(i in interval){
        sum += i * 2 * 1
    }

    log("Fim")
}

fun main(){
    top()
    log("Log")
}