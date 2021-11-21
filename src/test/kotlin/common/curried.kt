package common

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class CurriedTest : WordSpec({

    "curried" should {
        """!break down a function that takes multiple arguments into
            a series of functions that each take only one argument""" {

            val f: (Int) -> (Int) -> String = { a: Int, b: Int -> "$a:$b" }.curried()
            val y = f(1)(2)
            val z = f(1)(3)
            y shouldBe "1:2"
            z shouldBe "1:3"
        }
        """!not execute before all arguments are provided""" {
            var i = 0
            val f: (Int) -> (Int) -> String =
                { a: Int, b: Int ->
                    i++
                    "$a:$b"
                }.curried()
            val y = f(1)
            i shouldBe 0
            val y2 = y(2)
            i shouldBe 1
            y2 shouldBe "1:2"

            val z = f(1)
            i shouldBe 1
            val z2 = z(3)
            i shouldBe 2
            z2 shouldBe "1:3"
        }
    }
})