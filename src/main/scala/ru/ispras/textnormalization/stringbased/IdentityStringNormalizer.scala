package ru.ispras.textnormalization.stringbased

/**
  * Created by padre on 04.12.15.
  */
class IdentityStringNormalizer extends AbstractStringBased{
    override def apply(string: String): String = string
}
