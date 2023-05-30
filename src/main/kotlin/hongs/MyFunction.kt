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
// 주석
// 커밋 테스트!!
fun test(flag: Boolean): String {
    return if (flag) {
        "true"
    } else {
        "false"
    }
}
