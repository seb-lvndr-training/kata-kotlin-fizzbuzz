package com.example.fizzbuzz

object Fizzbuzz {

    fun execute(value: Int): String {
        if (value > 0) {
            when {
                isModulo3(value) && isModulo5(value) -> return "Fizzbuzz"
                isModulo3(value) -> return "Fizz"
                isModulo5(value) -> return "Buzz"
            }
        }
        return value.toString()
    }

    private fun isModulo3(value: Int): Boolean {
        return isModulo(value, 3)
    }

    private fun isModulo5(value: Int): Boolean {
        return isModulo(value, 5)
    }

    private fun isModulo(value: Int, module: Int): Boolean {
        return value % module == 0
    }

}
