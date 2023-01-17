package functionalprogramming.chapter02

fun main() {
    val box3: Box3<Car> = object: Box3<Car> {
        override fun read(): Car {
            return Car()
        }
    }
}

interface Box3<out T> {
    fun read(): T
//    fun write(value: T)
}

interface Box4<in T> {
    //    fun read(): T
    fun write(value: T)
}

open class Plastic
open class Toy : Plastic()
open class Car : Toy()
open class Robot : Toy()