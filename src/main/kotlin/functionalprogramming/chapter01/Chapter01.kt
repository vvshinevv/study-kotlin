package functionalprogramming

fun main(args: Array<String>) {

}

var z = 10

fun impureFunction(x: Int, y: Int): Int = x + y + z

fun withSideEffect(x: Int, y: Int): Int {
    z = y
    return x + y
}