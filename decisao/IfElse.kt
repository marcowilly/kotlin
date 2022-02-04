package com.example.myapplication

fun maiorDeIdade(idade: Int){
    if(idade >= 18){
        println("Maior de idade!")
    }else{
        println("Não é maior de idade")
    }
}

fun calculaBonus(cargo: String, salario: Float) : Float{
    return if(cargo.equals("Coordenador")){
        salario * 0.2f
    }else if(cargo.equals("Gerente Junior")){
        salario * 2
    }else{
        salario * 0.5f
    }
}

fun main(){
    maiorDeIdade(18)
    maiorDeIdade(16)
    println(calculaBonus("Coordenador",5000F))
}