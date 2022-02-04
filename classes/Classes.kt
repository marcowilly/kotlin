package com.example.myapplication.classes

class Pessoa3 (var nome: String) {

    var ano: Int? = null

    constructor(nome: String, ano: Int) : this(nome) {
        this.ano = ano
    }

    fun saudacao(){
        println("Olá, meu nome é $nome, nasci em $ano")
    }
}

class Maquina (var marca: String){
    var nucleos: Int = 0
    get() {
        println("Get foi chamado")
        return field
    }
    set(value) {
        println("Set foi chamado")
        field = value
    }

    fun ligar(){

    }

    fun processar(){

    }

    fun desligar(){

    }
}

fun main(){
    var m = Maquina("XPTO")

    with(m){
        ligar()
        processar()
        desligar()
    }

    val p1 = Pessoa3("Marco Willy", 1999)
    val p2 = Pessoa3("Tony")
    p1.saudacao()
    p2.saudacao()
}