package common

private val f = {
    fun <A, B, C> ((A) -> (B) -> C).uncurried(): ((A, B) -> C) = { a, b -> this(a)(b) }
}