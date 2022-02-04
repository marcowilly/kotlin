package com.example.myapplication.oo

interface Machine {
    fun ligar()
    fun desligar(){
        println("Off")
    }
}

class Computer() : Machine {
    override fun ligar() {
        TODO("Not yet implemented")
    }
}

interface interface1 {
    fun ola(){
        println("interface 1")
    }
}

interface interface2 {
    fun ola(){
        println("interface 2")
    }
}

class ImplementaInterface : interface1, interface2 {
    override fun ola() {
        super<interface2>.ola()
    }
}

fun main(){

}