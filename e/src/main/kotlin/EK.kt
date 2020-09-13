class EK {
    fun hello() = println("Hello from ${this::class.java} ${helloK(K())}")

    fun helloK(param: K) = println("Hello from ${this::class.java} param ${param.hello()}")
}
