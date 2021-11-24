package data.solution

import data.Cons
import data.List
import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

fun <A> reverse(xs: List<A>): List<A> = List.foldLeft(xs, List.empty()) { x, y -> Cons(y, x) }

class Exercise11 : WordSpec({
    "list reverse" should {
        "reverse list elements" {
            reverse(List.of(1, 2, 3, 4, 5)) shouldBe
                    List.of(5, 4, 3, 2, 1)
        }
    }
})
