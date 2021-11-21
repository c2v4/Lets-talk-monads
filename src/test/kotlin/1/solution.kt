package `1`

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class ExerciseSolution : WordSpec({

    fun fib(i: Int): Int {
        tailrec fun go(i: Int, acc1: Int, acc2: Int): Int =
            when (i) {
                0 -> acc1
                1 -> acc2
                else -> go(i - 1, acc2, acc1 + acc2)
            }
        return go(i, 0, 1)
    }

    "fib" should {
        "!return the nth fibonacci number" {
            mapOf(
                1 to 1,
                2 to 1,
                3 to 2,
                4 to 3,
                5 to 5,
                6 to 8,
                7 to 13,
                8 to 21,
                1000000000 to 1532868155
            ).forEach { (n, num) ->
                fib(n) shouldBe num
            }
        }
    }
})
