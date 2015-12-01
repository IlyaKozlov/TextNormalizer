package ru.ispras.textnormalization

import ru.ispras.textnormalization.stringbased.AbstractStringBased
import ru.ispras.textnormalization.tokenizer.AbstractTokenizer
import ru.ispras.textnormalization.wordbased.AbstractWordBasedNormalizer

/**
  * Created by padre on 02.12.15.
  */
class TextNormalizer(
                    private val stringBased: AbstractStringBased,
                    private val tokenizer: AbstractTokenizer,
                    private val wordNormalizer: AbstractWordBasedNormalizer) {

    def apply(text: String) = {
        val preprocessedText = stringBased(text)
        val words = tokenizer(preprocessedText)
        wordNormalizer(words)
    }

}
