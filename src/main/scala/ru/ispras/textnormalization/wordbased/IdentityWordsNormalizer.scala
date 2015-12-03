package ru.ispras.textnormalization.wordbased

/**
  * Created by padre on 04.12.15.
  */
class IdentityWordsNormalizer extends AbstractWordBasedNormalizer {
    def apply(words: Seq[String]): Seq[String] = words
}
