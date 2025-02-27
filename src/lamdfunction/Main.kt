package lamdfunction

fun main(){
    val lamda = {a: Int, b: Int -> a+b}
    println(5 * lamda(5,10))
}