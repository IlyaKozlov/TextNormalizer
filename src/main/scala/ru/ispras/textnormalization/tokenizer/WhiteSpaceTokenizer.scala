package ru.ispras.textnormalization.tokenizer

/**
  * Created by padre on 02.12.15.
  */
class WhiteSpaceTokenizer extends AbstractTokenizer{
    def apply(string: String): Seq[String] = string.split(" +")
}
