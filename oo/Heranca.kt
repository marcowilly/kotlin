package com.example.myapplication.oo

/**
 * Herança
 * open é uma palavra que indica que a classe pode usada na arvore de herança
 */

open class Maquina(val marca: String){
    open fun minhaMarca(){
        println("Minha marca é $marca")
    }
}

class Computador(marca: String, val nucleos: Int) : Maquina(marca) {

    //Sobrescrita
    override fun minhaMarca() {
        super.minhaMarca()
        println("Estou rescrevendo minha marca")
    }
    fun ligar(){}
    fun processar(){}

    //Sobrecarga
    fun overload(i: Int) = println("Overload 1")
    fun overload(i: String) = println("Overload 2")
    fun overload(i: String, b: Boolean) = println("Overload 3")

    private fun validate(){

    }
}

fun main(){
    val c = Computador("Samsung", 6)
    with(c){
        ligar()
        processar()
        minhaMarca()
    }
}