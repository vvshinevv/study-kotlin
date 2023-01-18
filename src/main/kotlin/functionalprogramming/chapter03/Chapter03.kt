package functionalprogramming.chapter03

fun main() {
    println(factorial(5))
}

fun power(x: Double, n: Int) : Double = when (n) {
    1 -> x
    else -> x * power(x, n -1)
}

fun factorial(n : Int): Int = when (n) {
    1 -> 1
    else -> n * factorial(n - 1)
}