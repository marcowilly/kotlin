package com.example.myapplication.basico

fun endereco(rua: String = "",
             cidade: String,
             estado: String,
             cep: String,
             numero: String = "0"){
    println("Rua: $rua")
    println("Cidade: $cidade, $estado, $cep")
}

fun main(){
    endereco(cidade = "Campinas", estado = "São Paulo", cep = "13")
    endereco(cep = "13", cidade = "Campinas", estado = "São Paulo")
}