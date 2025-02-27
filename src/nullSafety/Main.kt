package nullSafety

fun main(){
    val name: Any?  = null
    println(name?: "Hello")
}