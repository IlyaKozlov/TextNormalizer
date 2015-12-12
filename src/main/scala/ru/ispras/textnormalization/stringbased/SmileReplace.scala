package ru.ispras.textnormalization.stringbased

/**
  * Created by padre on 13.12.15.
  */
class SmileReplace extends AbstractStringBased{

    val smileRegexp = "[;:]?\\-?[)D]+".r
    val sadSmileRegexp = "[;:]?\\-?\\(+".r

    def apply(string: String): String = sadSmileRegexp.replaceAllIn(smileRegexp.replaceAllIn(string, " SMILE "), " SAD_SMILE ")
}
