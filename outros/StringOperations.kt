package com.example.myapplication

fun quebraString(){
    //String quebrada
    val str = """MARCO
            |WILLY
            |AZEVEDO
            |GOMES
        """.trimMargin()

    print(str)
}

fun hello2(nome: String) : String = "Olá, $nome"

fun hello(nome: String) : String{
    return "Olá, $nome"
}

fun printOperations(){
    println(hello("Marco Willy Azevedo Gomes!"))
    println(hello2("Marco Willy!"))
}

fun main(){
    quebraString()
    printOperations()
}