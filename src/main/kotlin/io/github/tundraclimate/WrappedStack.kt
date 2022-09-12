package io.github.tundraclimate

class WrappedStack<E>(private val stack: ArrayDeque<E> = ArrayDeque()) {
    val size
        get() = stack.size

    fun poll(): E? = stack.removeLastOrNull()
    fun peek(): E? = stack.lastOrNull()
    fun remove(): E = stack.removeLast()
    fun element(): E = stack.last()
    fun add(e: E): Boolean = stack.add(e)
    fun addFirst(e: E) = stack.addFirst(e)
    fun isEmpty(): Boolean = stack.isEmpty()
    fun toList(): List<E> = stack.toList()

    override fun toString(): String = stack.toString()
}