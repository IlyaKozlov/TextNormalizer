package ru.ispras.textnormalization.stringbased

/**
  * Created by padre on 02.12.15.
  */
class Lowercase extends AbstractStringBased {
    def apply(string: String): String = string.toLowerCase()
}
