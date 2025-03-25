package dagger2

class UserRepository {

    fun saveUser(email: String, password: String){
        println("User save in database")
    }
}