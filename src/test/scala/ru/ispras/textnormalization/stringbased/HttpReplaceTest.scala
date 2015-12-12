package ru.ispras.textnormalization.stringbased

import org.scalatest.FunSuite

/**
  * Created by padre on 04.12.15.
  */
class HttpReplaceTest  extends FunSuite {
    val normalizer = new HttpReplace()

    test("String without url should not be changed ") {
        assertResult("")(normalizer(""))
        assert(normalizer("If you would rather be told") == "If you would rather be told")
        assert(normalizer("Я сегодня утром ранним") == "Я сегодня утром ранним")
    }

    test("Http should be replaced ") {
        assertResult(" URL ")(normalizer("http://peremogi.livejournal.com/"))
        assert(normalizer("If you would http://peremogi.livejournal.com/ rather be told") == "If you would  URL  rather be told")
        assert(normalizer("Я сегодня утром ранним http://peremogi.livejournal.com/") == "Я сегодня утром ранним  URL ")
    }

    test("Https should be replaced ") {
        assertResult(" URL ")(normalizer("https://www.yandex.ru/"))
        assert(normalizer("If you would https://www.yandex.ru/ rather be told") == "If you would  URL  rather be told")
        assert(normalizer("Я сегодня утром ранним https://www.yandex.ru/") == "Я сегодня утром ранним  URL ")
    }
}
