package ru.ispras.textnormalization.stringbased

/**
  * Created by padre on 02.12.15.
  */
class NumReplace extends AbstractStringBased{
    val numberRegexp = "-?[0-9]+.?[0-9]*".r

    def apply(string: String): String = numberRegexp.replaceAllIn(string, "NUM")
}
