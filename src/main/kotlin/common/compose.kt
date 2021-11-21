package common

infix fun <A, B, C> ((B) -> C).compose(f: (A) -> B): (A) -> C = TODO()
infix fun <A, B, C> ((B) -> C).andThen(f: (A) -> B): (A) -> C = TODO()