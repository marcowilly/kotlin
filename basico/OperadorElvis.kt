package com.example.myapplication.basico

fun main(){
    val teste: Int? = null
    val op : Int = teste ?: 100 //Verifica se é nulo, se sim atribui valor a direita.
    println("Operador elvis: $op")
}