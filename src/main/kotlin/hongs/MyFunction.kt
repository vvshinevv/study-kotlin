package hongs


fun main() {

}

fun differ1(): () -> String {
    println("aa")
    return {
        "abc"
    }
}

fun differ2(): () -> Unit = {
    println("aa")
}

fun test(flag: Boolean): String {
    return if (flag) {
        "true"
    } else {
        "false"
    }
}