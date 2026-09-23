fun String.containsSubstring(substring:String):Boolean{
    return this.contains(substring)
}
fun main(){
    val chaines1="bonjour"
    val chaines2=" devOAM202"
    println(chaines1.containsSubstring("bonjour"))
    println(chaines2.containsSubstring("devOAM202"))
    println(chaines1.containsSubstring("mobile"))
    println(chaines2.containsSubstring("android"))
}