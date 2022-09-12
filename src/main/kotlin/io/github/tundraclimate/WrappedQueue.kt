package io.github.tundraclimate

class WrappedQueue<E>(private val queue: ArrayDeque<E> = ArrayDeque()) {
    val size
        get() = queue.size

    fun poll(): E? = queue.removeFirstOrNull()
    fun peek(): E? = queue.firstOrNull()
    fun remove(): E = queue.removeFirst()
    fun element(): E = queue.first()
    fun add(e: E): Boolean = queue.add(e)
    fun addFirst(e: E) = queue.addFirst(e)
    fun isEmpty(): Boolean = queue.isEmpty()
    fun toList(): List<E> = queue.toList()

    override fun toString(): String = queue.toString()
}