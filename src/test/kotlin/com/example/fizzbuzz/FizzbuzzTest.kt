package com.example.fizzbuzz

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class FizzbuzzTest {

    @ParameterizedTest
    @MethodSource
    fun fizzbuzz_should_return_expected_result(value: Int, expectedResult: String) {
        // When
        val result = Fizzbuzz.execute(value)

        //Then
        Assertions.assertEquals(expectedResult, result)
    }

    companion object {
        @JvmStatic
        private fun fizzbuzz_should_return_expected_result(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(0, "0"),
                Arguments.of(1, "1"),
                Arguments.of(2, "2"),
                Arguments.of(3, "Fizz"),
                Arguments.of(4, "4"),
                Arguments.of(5, "Buzz"),
                Arguments.of(6, "Fizz"),
                Arguments.of(15, "Fizzbuzz"),
            )
        }
    }
}
