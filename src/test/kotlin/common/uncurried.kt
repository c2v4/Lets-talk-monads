package common

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class UncurriedTest : WordSpec({

    "uncurried" should {
        """!take a function accepting two values and then apply that
            function to the components of the pair which is the
            second argument"""" {

            val f: (Int, Int) -> String =
                { a: Int -> { b: Int -> "$a:$b" } }.uncurried()
            f(1, 2) shouldBe "1:2"
            f(1, 3) shouldBe "1:3"
        }
    }
})