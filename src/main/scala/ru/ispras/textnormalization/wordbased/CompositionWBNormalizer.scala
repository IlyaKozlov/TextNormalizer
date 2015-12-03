package ru.ispras.textnormalization.wordbased

/**
  * Created by padre on 02.12.15.
  */
class CompositionWBNormalizer(private val normalizers: Seq[AbstractWordBasedNormalizer]) extends AbstractWordBasedNormalizer {
    def apply(words: Seq[String]): Seq[String] = normalizers.foldLeft(words)((words, normalizer) => normalizer(words))
}
