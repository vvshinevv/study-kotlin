package kotlininaction.chapter03

fun String.lastCharByHong(): Char = get(this.length - 1)

var StringBuilder.lastCharByHong: Char
    get() = get(length - 1)
    set(value: Char) {
        setCharAt(length - 1, value)
    }