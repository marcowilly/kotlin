package com.example.myapplication.collections

data class Food(val name: String, val calories: Double, val ingredients: List<Ingredients> = listOf())

data class Ingredients(val nome: String, val quantity: Int)

fun main(){
    val data = listOf(
        Food("Lasanha", 1200.0,
                listOf(Ingredients("Farinha", 1),
                        Ingredients("Presunto", 5),
                        Ingredients("Queijo", 10),
                        Ingredients("Molho de tomate", 2),
                        Ingredients("Manjericão", 3)
                )
        ),
        Food("Panqueca", 500.0),
        Food("Omelete", 200.0),
        Food("Parmegiana", 700.0),
        Food("Sopa de feijão", 300.0),
        Food("Hamburger", 2000.0,
                listOf(Ingredients("Pão", 1),
                        Ingredients("Hamburger", 3),
                        Ingredients("Queijo", 1),
                        Ingredients("Catupiry", 1),
                        Ingredients("Bacon", 3),
                        Ingredients("Alface", 1),
                        Ingredients("Tomate", 2)
                )
        )
    )

    //Tenho receitas na lista?
    println("Tenho receitas? ${if(data.any()) "Sim" else "Não"}.")

    //Quantas receitas tenho na coleção?"
    println("Tenho ${data.count()} receitas.")

    //Qual a primeira e última receita?
    println("A primeira receita é: ${data.first().name}")
    println("A última receita ê: ${data.last().name}")

    //Qual a soma de calorias?
    val sumCalories = data.sumByDouble { it.calories }
    print("A soma de calorias é: $sumCalories")
    
    //Me dê as duas primeiras receitas!
    val fristTwo = data.take(2)
    for(x in fristTwo.withIndex()){
        println("${x.index + 1} - ${x.value.name}")
    }
    
    // Sei como fazer panqueca? E sushi?
    val knowPancake = data.filter{ it.name == "Panqueca"}.any()
    println("Sei fazer panqueca? ${if(knowPancake) "Sim" else "Não"}")

    val knowSushi = data.filter{it.name == "Sushi"}.any()
    println("Sei fazer sushi? ${if(knowPancake) "Sim" else "Não"}")

    //Quais são as comidas com mais de 500 calorias?
    data.filter{ it.calories > 500 }.forEach{ println( it.name ) }

    //Par(chave, valor) de comidas com mais de 500 calorias(name, calorias)
    data.filter{ it.calories > 500 }.map{ Pair(it.name, it.calories)}.forEach{ println("${it.first} : ${it.second}") }

    //Quais das receitas possui farinha como ingrediente?
    data.filter { hasIngredient(it.ingredients, "Farinha") }.forEach{ println(it.name) }
}

fun hasIngredient(list: List<Ingredients>, name: String): Boolean {
    return list.filter { it.nome == name }.any()
}