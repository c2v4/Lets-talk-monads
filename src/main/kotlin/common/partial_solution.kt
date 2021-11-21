package common

private val f = {
    fun <A, B, C> ((A, B) -> C).partial1(a: A): (B) -> C = { b -> this(a, b) }
    fun <A, B, C> ((A, B) -> C).partial2(b: B): (A) -> C = { a -> this(a, b) }
}