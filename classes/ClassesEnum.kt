package com.example.myapplication.classes

enum class Prioridade {
    BAIXA, MEDIA, ALTA
}

enum class Prioridade2(val id: Int){
    BAIXA(1){
        override fun toString(): String {
            return "Super baixa, não se preocupe"
        }
    },
    MEDIA(5), ALTA(10)
}

class Alarme(var desc: String, p: Prioridade2)

fun main(){
    // Alarme("Aviso!", Prioridade2.ALTA)

    for(p in Prioridade2.values()){
        println("$p - ${p.id} - ${p.ordinal}")
    }
}