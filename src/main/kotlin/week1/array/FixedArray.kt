package week1.array

interface FixedArray<T> {
    val size: Int
    fun get(index: Int): T
    fun set(index: Int, value: T)
    fun search(value: T): Int
}
