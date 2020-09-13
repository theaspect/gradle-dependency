class EI {
    fun hello() = println("Hello from ${this::class.java}")

    fun helloI(param: K) = println("Hello from ${this::class.java} param ${param.hello()}")
}
