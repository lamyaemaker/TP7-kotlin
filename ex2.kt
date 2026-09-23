fun main(){
    val fruits = mutableListOf<String>()
        fruits.add("Pomme")
        fruits.add("Banane")
        fruits.add("Orange")
        fruits.add("Fraise")
        fruits.remove("Banane")
        val recherche = "Orange"

        if (fruits.contains(recherche)) {
            println("$recherche est présent dans la liste.")
        } else {
            println("$recherche n'est pas présent dans la liste.")
        }
        println("Taille de la liste : $fruits.size")
        println("Contenu de la liste : $fruits")
    }
