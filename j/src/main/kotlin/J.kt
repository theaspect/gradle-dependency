open class J {
    @Throws(JException::class)
    open fun hello(): Unit = throw JException()
}

class JException : java.lang.Exception()
