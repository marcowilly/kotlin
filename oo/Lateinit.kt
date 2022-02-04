package com.example.myapplication.oo

class Pessoa {
    lateinit var nome: String

    fun geradorDeNome(){
        nome = "iufgausf"
    }
}

fun main(){
    val p = Pessoa()
    p.geradorDeNome()
}