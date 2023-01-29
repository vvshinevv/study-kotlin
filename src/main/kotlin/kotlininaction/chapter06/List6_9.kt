package kotlininaction.chapter06

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun main() {
    val person: List67.Person = List67.Person("hongs.choi")
    person.let {
        println(it)
        sendEmailTo(it.name)
    }
}

object List67 {
    data class Person(val name: String)
}