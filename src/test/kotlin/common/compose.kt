package common

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class ComposeTest : WordSpec({

    "compose" should {
        "!apply function composition over two functions" {
            val fahrenheit2celsius: (Double) -> String =
                { b: Double -> "$b degrees celsius" } compose { a: Double -> (a - 32.0) * (5.0 / 9.0) }
            fahrenheit2celsius(68.0) shouldBe "20.0 degrees celsius"
        }
    }
})