package chapter04

class Person(val name: String) {
    companion object : JSONFactory<Person> {
        override fun fromJSON(jsonText: String): Person = Person("ab")
    }
}

fun main(args: Array<String>) {

}
