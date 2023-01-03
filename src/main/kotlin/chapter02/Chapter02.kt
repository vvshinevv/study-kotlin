package chapter02

import java.util.TreeMap


fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    val list = arrayListOf("10", "11", "1001")
    for ((i, e) in list.withIndex()) {
        println("$i: $e")
    }

    ex1(1111)
}

fun ex1(percentage: Int) {
    if (percentage !in 0..100) {
        throw IllegalArgumentException("not in")
    }

    println("$percentage is 0 in 100")
}