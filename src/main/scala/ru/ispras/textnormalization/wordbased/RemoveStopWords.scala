package ru.ispras.textnormalization.wordbased

import scala.io.Source

/**
  * Created by padre on 02.12.15.
  */
class RemoveStopWords(private val stopWords: Set[String]) extends AbstractWordBasedNormalizer {

    def apply(words: Seq[String]): Seq[String] = words.filterNot(stopWords)
}

object RemoveStopWords {
    def apply(stopWordsPath: String) = new RemoveStopWords(Source.fromFile(stopWordsPath).getLines().toSet)

}
