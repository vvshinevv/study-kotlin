package kotlininaction.chapter04

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}