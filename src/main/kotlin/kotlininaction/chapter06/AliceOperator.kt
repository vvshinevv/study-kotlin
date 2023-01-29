package kotlininaction.chapter06

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)

class Company(val name: String, val address: Address?)

class User(val name: String, val company: Company?)

fun printShippingLabel(user: User) {
    val address = user.company?.address ?: throw IllegalArgumentException("No address")
    with(address) {
        println(streetAddress)
        println("$zipCode $city $country")
    }
}

fun main() {
    val address = Address("Elsestr, 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val user = User("Dmitry", jetbrains)
    printShippingLabel(user)
    printShippingLabel(User("Alexey", null))
}