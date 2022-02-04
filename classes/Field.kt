package com.example.myapplication.classes

class Car(val model: String, val maxSpeed: Int) {
    var curentSpeed: Int = 0
    set(value){
        if(value > maxSpeed){
            throw Exception("Velocidade maior que a permitida!")
        }else{
            field = value
        }
    }
    get(){
        return field
    }

}

fun main(args: Array<String>){
    var c1 = Car("Gol", 220)
    c1.curentSpeed = 50

    println(c1.curentSpeed)
}