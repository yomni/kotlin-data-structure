package io.yomni.week1.array

interface Array<T> {
    val size: Int
    fun get(index: Int): T
    fun set(index: Int, value: T)
}
