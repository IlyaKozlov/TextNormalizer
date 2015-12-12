package ru.ispras.textnormalization.stringbased

import org.scalatest.FunSuite

/**
  * Created by padre on 13.12.15.
  */
class SmileReplaceTest extends FunSuite {
    val normalizer = new SmileReplace()

    test("String without smile should not be changed ") {
        assertResult("")(normalizer(""))
        assert(normalizer("If you would rather be told") == "If you would rather be told")
        assert(normalizer("Я сегодня утром ранним") == "Я сегодня утром ранним")
    }

    test("Smile should be replaced ") {
        assertResult(" SMILE ")(normalizer(")))"))
        assert(normalizer("If you would :) rather be told") == "If you would  SMILE  rather be told")
        assert(normalizer("If you would :-) rather be told") == "If you would  SMILE  rather be told")
        assert(normalizer("If you would rather be told :-)") == "If you would rather be told  SMILE ")
        assert(normalizer("If you would rather be told :D") == "If you would rather be told  SMILE ")

    }

    test("sad smile should be replaced by SAD_SMILE ") {
        assertResult(" SAD_SMILE ")(normalizer("(("))
        assert(normalizer("If you would :( rather be told") == "If you would  SAD_SMILE  rather be told")
        assert(normalizer("Я сегодня утром ранним :(((") == "Я сегодня утром ранним  SAD_SMILE ")
    }
}
