package any

fun main(){
    square(5)
}

fun square(number: Any){
    println(number.toString().toInt().times(number.toString().toInt()))
}
fun main2() {

    val obj = Coffee(Milk())
    obj.makeCoffee()



}

class Coffee(private val milk: Milk){
    fun makeCoffee(){
        milk.provideMilk()
        println("Make coffee is performed")
    }
}
class Milk{
    fun provideMilk(){
        println("Milk has provided")
    }
}