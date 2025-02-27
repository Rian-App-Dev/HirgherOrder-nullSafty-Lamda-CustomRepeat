package higherOrderFunction

fun main() {
    mainRepeat(5){
        println("Hello world")
    }
}

fun main2(function: (a: Int, b: Int) -> Unit) {
    function(5, 6)
}
fun mainRepeat(a: Int, repeatValue: () -> Unit){
    for (i in 1..a){
        repeatValue()
    }
}
