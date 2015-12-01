package ru.ispras.textnormalization.stringbased

/**
  * Created by padre on 02.12.15.
  */
class CompositionNormalizer(val normalizers: Seq[AbstractStringBased]) extends AbstractStringBased {
    def apply(string: String): String = normalizers.foldLeft(string)((string, normalizer) => normalizer(string))
}
