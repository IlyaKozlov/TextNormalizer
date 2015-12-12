package ru.ispras.textnormalization.stringbased

/**
  * Created by padre on 02.12.15.
  */
class HttpReplace extends AbstractStringBased{
    val httpRegexp = "https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_\\+.~#?&//=]*)".r

    def apply(string: String): String = httpRegexp.replaceAllIn(string, " URL ")
}