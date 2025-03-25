package builderPattaren

class User private constructor(
    val name: String,
    val age: Int,
    val email: String,
    val phone: String?,
    val address: String?,
    val isVerified: Boolean
) {
    class Builder {
        private var name: String = ""
        private var age: Int = 0
        private var email: String = ""
        private var phone: String? = null
        private var address: String? = null
        private var isVerified: Boolean = false

        fun setName(name: String) = apply { this.name = name }
        fun setAge(age: Int) = apply { this.age = age }
        fun setEmail(email: String) = apply { this.email = email }
        fun setPhone(phone: String?) = apply { this.phone = phone }
        fun setAddress(address: String?) = apply { this.address = address }
        fun setIsVerified(isVerified: Boolean) = apply { this.isVerified = isVerified }

        fun build(): User {
            return User(name, age, email, phone, address, isVerified)
        }
    }
}
