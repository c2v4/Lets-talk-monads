package data.solution

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe
import data.List
import data.Nil

class LengthTest : WordSpec({
    fun <A> length(xs: List<A>): Int = List.foldLeft(xs,0) { acc, _ -> acc + 1 }

    "list length" should {
        "!calculate the length" {
            length(List.of(1, 2, 3, 4, 5)) shouldBe 5
        }

        "!calculate zero for an empty list" {
            length(Nil) shouldBe 0
        }
    }
})
