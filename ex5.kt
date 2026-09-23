fun main() {
    val nombres = mutableListOf<Int>()

    nombres.add(50)
    nombres.add(10)
    nombres.add(30)
    nombres.add(20)
    nombres.add(40)

    println("Liste mutable : $nombres")
    val listeImmuable: List<Int> = nombres.toList()
    nombres.sort()
    println("Liste mutable triée : $nombres")
    println("Liste immuable : $listeImmuable")
}