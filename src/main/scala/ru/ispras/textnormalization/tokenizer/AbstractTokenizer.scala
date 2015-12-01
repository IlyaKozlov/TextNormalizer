package ru.ispras.textnormalization.tokenizer

/**
 * Created by padre on 02.12.15
 */
trait AbstractTokenizer {
    def apply(string: String): Seq[String]
}
