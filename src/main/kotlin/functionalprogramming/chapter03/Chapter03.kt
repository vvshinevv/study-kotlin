package functionalprogramming.chapter03

fun main() {
    val a = listOf<Int>(1) + listOf<Int>(2)
    println(a)

}

fun power(x: Double, n: Int) : Double = when (n) {
    1 -> x
    else -> x * power(x, n -1)
}

fun factorial(n : Int): Int = when (n) {
    1 -> 1
    else -> n * factorial(n - 1)
}