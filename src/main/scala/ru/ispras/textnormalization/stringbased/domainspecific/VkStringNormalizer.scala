package ru.ispras.textnormalization.stringbased.domainspecific

import ru.ispras.textnormalization.stringbased.AbstractStringBased

/**
  * Created by padre on 13.12.15.
  */
class VkStringNormalizer  extends AbstractStringBased{
    val userRegexp = "\\[id[0-9]+\\|[a-zA-Zа-яА-Я0-9]+]".r

    def apply(string: String): String = userRegexp.replaceAllIn(string, " USER ")
}