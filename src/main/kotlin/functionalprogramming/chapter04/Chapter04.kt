package functionalprogramming.chapter04

fun main(args: Array<String>) {

}

fun higherOrder(func: (Int, Int) -> Int, x: Int, y: Int): Int = func(x, y)