package ru.ispras.textnormalization.stringbased.domainspecific

import org.scalatest.FunSuite

/**
  * Created by padre on 13.12.15.
  */
class VkStringNormalizerTest  extends FunSuite {
    val normalizer = new VkStringNormalizer()

    test("String without user ref should not be changed ") {
        assertResult("")(normalizer(""))
        assert(normalizer("If you would rather be told") == "If you would rather be told")
        assert(normalizer("Я сегодня утром ранним") == "Я сегодня утром ранним")
    }

    test("User ref should be replaced ") {
        assert(normalizer("[id17574330|Илья], If you would rather be told") == " USER , If you would rather be told")

    }

}
