package dagger2


class EmailService {
    fun send(to: String, from: String, body: String){
        println("Email sent")
    }
}