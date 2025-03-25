package DI_cheak





class Car {

    private val engine = Engine()

    fun start() {
        engine.start()
    }
    class Car2{
        
    }
}

fun main() {
    val car = Car()
    car.start()
}