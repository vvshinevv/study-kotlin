package kotlininaction.chapter06

class Person {
    var name: String? = null
    var age: Int? = null
}

fun main() {
    val person: Person = Person().also {
        println(it.age)
    }
}

fun block(person: Person): Unit {
    println(person.name)
    println(person.age)
}
