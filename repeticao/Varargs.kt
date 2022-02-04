package com.example.myapplication

fun media(vararg notas: Float){
    if(notas.isNotEmpty()){
       var soma = 0f
       for(nota in notas){
           soma += nota
       }
        println("A média é ${soma/notas.size}")
    }
}

fun <T> media(vararg  valores: T){
    for(valor in valores){
        println(valor)
    }
}

fun main(){
    media(8f,9f,8f)
    media(1, 4f, "", false, "", "C")

    val str = "lorem ipsum"
    str.capitalize()
    str.decapitalize()
    str.contains("bla")
    str.startsWith("l", true)

    arrayOf(1,2,3,4,5,6,7,78,8).size
}