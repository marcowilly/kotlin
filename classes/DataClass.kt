package com.example.myapplication.classes

class Quadrado(val area: Float)

//Classe que transita dados
data class Triagulo(val area: Float)

fun main(){
    var q1 = Quadrado(10f)
    var q2 = Quadrado(10f)
    var t1 = Triagulo(10f)
    var t2 = Triagulo(10f)

    println(q1 == q2)
    println(t1 == t2)

    //copy
    val t3 = t2.copy()
    println(t3)
}