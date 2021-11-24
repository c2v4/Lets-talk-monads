package data.excercise

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe
import data.List
import data.Nil

fun <A> length(xs: List<A>): Int = TODO()

class LengthTest : WordSpec({
    "list length" should {
        "!calculate the length" {
            length(List.of(1, 2, 3, 4, 5)) shouldBe 5
        }

        "!calculate zero for an empty list" {
            length(Nil) shouldBe 0
        }
    }
})
