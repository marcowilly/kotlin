package com.example.myapplication.classes

/**
 * Sealed class tem visibilidade de herança no arquivo
 */

sealed class Result{
    class Success(val message: String) : Result()
    class Error(val message: String, val error: Int) : Result()
}

class Repo {
    fun executeSuccess() : Result {
        return Result.Success("Deu certo!")
    }
    fun executeError() : Result {
        return Result.Error("Deu erro!", 404)
    }
}

fun main(){
    when(Repo().executeError()){
        is Result.Error -> {
            println("Deu erro!")
        }
        else -> {
            println("Deu sucesso!")
        }
    }
}