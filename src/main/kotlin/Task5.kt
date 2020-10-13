object Task5 {

    private fun fib(stearsCount: Int): Int {
        return if (stearsCount <= 1) stearsCount else fib(stearsCount - 1) + fib(stearsCount - 2)

    }

    fun countVariants(s: Int): Int {
        return fib(s + 1)
    }
}