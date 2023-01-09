package chapter04

class DelegatingCollection<T>(private val innerList: Collection<T> = ArrayList<T>()) : Collection<T> by innerList {
    override val size: Int
        get() = innerList.size
}