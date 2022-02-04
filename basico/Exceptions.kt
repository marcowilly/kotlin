package com.example.myapplication.basico

import java.lang.Exception
import java.lang.NumberFormatException

fun main() {
    try {
        println("Marco".toInt())
    } catch (e: NumberFormatException) {
        println("Esse valor não é um número!")
    } catch (e: Exception) {
        println("Algo de errado ocorreu")
    } finally {
        println("Finally chamado!")
    }
}