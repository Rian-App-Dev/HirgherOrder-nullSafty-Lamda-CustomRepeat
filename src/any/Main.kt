package any

fun main(){
    square(5)
}

fun square(number: Any){
    println(number.toString().toInt().times(number.toString().toInt()))
}