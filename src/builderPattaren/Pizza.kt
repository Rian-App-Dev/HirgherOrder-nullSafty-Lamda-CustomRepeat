package builderPattaren

class Pizza private constructor(
    val size: String,
    val cheese: Boolean,
    val pepperoni: Boolean,
    val mushrooms: Boolean
) {
    class Builder {
        private var size: String = "Medium"
        private var cheese: Boolean = false
        private var pepperoni: Boolean = false
        private var mushrooms: Boolean = false

        fun setSize(size: String) = apply { this.size = size }
        fun addCheese() = apply { this.cheese = true }
        fun addPepperoni() = apply { this.pepperoni = true }
        fun addMushrooms() = apply { this.mushrooms = true }

        fun build(): Pizza {
            return Pizza(size, cheese, pepperoni, mushrooms)
        }
    }

    fun describe(): String {
        val toppings = mutableListOf<String>()
        if (cheese) toppings.add("Cheese")
        if (pepperoni) toppings.add("Pepperoni")
        if (mushrooms) toppings.add("Mushrooms")

        return "$size pizza with ${if (toppings.isEmpty()) "no toppings" else toppings.joinToString()}"
    }
}
