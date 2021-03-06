package ru.ispras.textnormalization.builders

import ru.ispras.textnormalization.stringbased._
import ru.ispras.textnormalization.tokenizer.{PunctuationTokenizer, AbstractTokenizer}
import ru.ispras.textnormalization.wordbased.{RemoveStopWords, AbstractWordBasedNormalizer}

/**
  * Created by padre on 04.12.15.
  */
class TMBuilder(val stopWordsPath: String) extends Builder{
    protected def getStringNormalizer = {
        new CompositionNormalizer( Array(new Lowercase(), new NumReplace(), new HttpReplace()))
    }

    protected def getTokenizer: AbstractTokenizer = new PunctuationTokenizer()

    protected def getWordsNormalizer: AbstractWordBasedNormalizer = RemoveStopWords(stopWordsPath)
}
