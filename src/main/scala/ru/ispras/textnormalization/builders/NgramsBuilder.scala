package ru.ispras.textnormalization.builders

import ru.ispras.textnormalization.stringbased.{HttpReplace, NumReplace, Lowercase, CompositionNormalizer}
import ru.ispras.textnormalization.tokenizer.{PunctuationTokenizer, AbstractTokenizer}
import ru.ispras.textnormalization.wordbased.{IdentityWordsNormalizer, AbstractWordBasedNormalizer}

/**
  * Created by padre on 04.12.15.
  */
class NgramsBuilder extends Builder{
    protected def getStringNormalizer = {
        new CompositionNormalizer( Array(new Lowercase(), new NumReplace(), new HttpReplace()))
    }

    protected def getTokenizer: AbstractTokenizer = new PunctuationTokenizer()

    protected def getWordsNormalizer: AbstractWordBasedNormalizer = new IdentityWordsNormalizer()
}
