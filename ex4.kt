fun main() {
    val utilisateurs = mutableMapOf<String, Int>()
    utilisateurs["Alice"] = 25
    utilisateurs["Bob"] = 30
    utilisateurs["Charlie"] = 22
    utilisateurs["David"] = 28

    println("Carte initiale : $utilisateurs")
    utilisateurs.remove("Charlie")

    println("Après suppression de Charlie : $utilisateurs")
    val age = utilisateurs["Alice"]
    println("L'âge de Alice est : $age")
    println("Clés : $utilisateurs.keys")
    println("Valeurs : $utilisateurs.values")
}