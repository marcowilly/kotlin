package com.example.myapplication.collections

fun main(args: Array<String>){
    //List, Array, Set, HashMap

    val l1 = listOf("Madrid", "São Paulo","Berlin") //Lista imutavel

    val l2 = mutableListOf("Madrid", "São Paulo","Berlin") //Lista mutavel

    val a1 = arrayListOf("Madrid", "São Paulo","Berlin") //ArrayList

    val s1 = setOf("Madrid","São Paulo","Berlin","Berlin") //Não aceita elementos repetidos e não aceita alteração
    val s2 = mutableSetOf("Madrid", "São Paulo", "Berlin", "Berlin") //Aceita alteracao mas não aceita elementos repetidos

    val h1 = hashMapOf<String, String>(Pair("Key", "Value"), Pair("França", "Paris"))
    val m2 = mutableMapOf(Pair("Key","value"), Pair("França","Paris"))

    println(h1["França"])
}