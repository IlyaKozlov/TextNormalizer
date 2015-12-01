package ru.ispras.textnormalization.wordbased

/**
  * Created by padre on 02.12.15.
  */
trait AbstractWordBasedNormalizer {
    def apply(words: Seq[String]): Seq[String]
}
