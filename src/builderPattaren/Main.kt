package builderPattaren

fun main() {

    val data = User.Builder().setAge(21).setName("Rian").setEmail("rfrian111@gmail.com").build()
    println()


    val myPizza = Pizza.Builder()
        .setSize("Large")
        .addCheese()
        .addMushrooms()
        .build()

    println(myPizza.describe())  // Output: Large pizza with Cheese, Mushrooms
    Example().sayHi()
    val x = Example2().sayHello()
}

class Example {
    fun sayHi() = apply { println("Hi")}
}
class Example2{
    fun sayHello(): Example2{
        println("Hello")
        return sayHello()
    }
}