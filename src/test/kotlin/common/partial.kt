package common

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class PartialTest : WordSpec({

    "partial" should {
        """!apply one argument to a function""" {

            val f: (Int, Int) -> String = { a: Int, b: Int -> "$a:$b" }
            val y = f.partially1(1)
            val z = f.partially2(2)
            y(3) shouldBe "1:3"
            z(4) shouldBe "4:2"
        }
        """!not execute before all arguments are provided""" {
            var i = 0
            val f: (Int, Int) -> String =
                { a: Int, b: Int ->
                    i++
                    "$a:$b"
                }
            val y = f.partially1(1)
            i shouldBe 0
            val y2 = y(2)
            i shouldBe 1
            y2 shouldBe "1:2"

            val z = f.partially2(2)
            i shouldBe 1
            val z2 = z(3)
            i shouldBe 2
            z2 shouldBe "3:2"
        }
    }
})