package dagger2

fun main() {

    val userRepository = UserRepository()
    val emailService = EmailService()
    val userRegistrationService = UserRegistrationService(userRepository, emailService)
    userRegistrationService.registerUser("cheezycode@gmail.com","11111")
}