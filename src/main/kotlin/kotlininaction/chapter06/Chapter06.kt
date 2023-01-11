package kotlininaction.chapter06

fun main(args: Array<String>) {
    strLen(null)
}

fun strLen(s: String?) = s?.length