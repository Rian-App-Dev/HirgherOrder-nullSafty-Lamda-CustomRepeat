package Loops

fun main2(){
    repeat(10){
        println(it)
    }
    for (i in 1..10){
        println(i)
    }
    var i = 1
    while (i<= 10){
        println(i)
        i++
    }
}




fun main11(){
    val totalSecond = readln().toInt()

    val hour = totalSecond.div(3600)
    val minute = totalSecond.mod(3600).div(60)
    val second = totalSecond.mod(60)

    println(hour)
    println(minute)
    println(second)
    main3()
}


fun main(){

}





















fun main3() {
    print("Enter time in seconds: ")
    val totalSeconds = readlnOrNull()?.toIntOrNull()

    if (totalSeconds != null && totalSeconds >= 0) {
        val hours = totalSeconds / 3600
        val minutes = (totalSeconds % 3600) / 60
        val seconds = totalSeconds % 60

        println("Time: %02d:%02d:%02d".format(hours, minutes, seconds))
    } else {
        println("Please enter a valid non-negative integer.")
    }
}
