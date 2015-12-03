package ru.ispras.textnormalization.tokenizer

/**
  * Created by padre on 02.12.15.
  */
class PunctuationTokenizer extends AbstractTokenizer {
    val punctuationRegexp = "[!?&.,;:-+ \t()]+"
    def apply(string: String): Seq[String] = string.split(punctuationRegexp)
}
