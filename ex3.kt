fun main(){
    val nombre=mutableSetOf<Int>()
    nombre.add(1)
    nombre.add(2)
    nombre.add(3)
    nombre.add(4)
    nombre.remove(1)
    if (30 in nombre) {
        println("Le nombre 30 est présent dans l'ensemble.")
    } else {
        println("Le nombre 30 n'est pas présent.")
    }


    println("Contenu de l'ensemble : $nombre")
}

