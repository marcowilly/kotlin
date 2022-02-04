package com.example.myapplication.classes

/**
 * inner class tem acesso a atributos da classe externa
 * class não tem aceso a atributos da classe externa
 */

class Computer(val processorModel: String){
    inner class InnerMemory{
        fun getMemoryLevel() : Int {
            return 70
        }
    }

    class Memory{
        fun getMemoryLevel() : Int {
            return 70
        }
    }
}

fun main() {
    val m1 = Computer.Memory()
    m1.getMemoryLevel()

    val buldozer = Computer("Intel").InnerMemory()
    buldozer.getMemoryLevel()
}