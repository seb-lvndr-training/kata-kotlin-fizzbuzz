package com.example.fizzbuzz

object Fizzbuzz {

    fun execute(value: Int): String {
        if (value > 0) {
            when {
                isModulo(value, 15) -> return "Fizzbuzz"
                isModulo(value, 5) -> return "Buzz"
                isModulo(value, 3) -> return "Fizz"
            }
        }
        return value.toString()
    }

    private fun isModulo(value: Int, module: Int): Boolean {
        return value % module == 0
    }

}
