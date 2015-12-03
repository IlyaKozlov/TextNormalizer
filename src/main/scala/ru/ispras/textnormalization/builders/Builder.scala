package ru.ispras.textnormalization.builders

import ru.ispras.textnormalization.TextNormalizer
import ru.ispras.textnormalization.stringbased.AbstractStringBased
import ru.ispras.textnormalization.tokenizer.AbstractTokenizer
import ru.ispras.textnormalization.wordbased.AbstractWordBasedNormalizer

/**
  * Created by padre on 04.12.15.
  */
abstract class Builder {

    def build = new TextNormalizer(getStringNormalizer, getTokenizer, getWordsNormalizer)

    protected def getStringNormalizer: AbstractStringBased

    protected def getWordsNormalizer: AbstractWordBasedNormalizer

    protected def getTokenizer: AbstractTokenizer

}
