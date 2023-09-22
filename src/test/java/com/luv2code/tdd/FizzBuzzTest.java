package com.luv2code.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    // if number is divisible by 3, print fizz
    // if number is divisible by 5, print buzz
    // if number is divisible by 3 and 5, print fizzbuzz
    // if number is not divisible by 3 and 5, print number

    @Test
    @Order(1)
    void test_For_Divisible_By_Three() {
        String expected = "Fizz";
        assertEquals(expected, FizzBuzz.compute(12), "Should Return Fizz");
    }

    @Test
    @Order(2)
    void test_For_Divisible_By_Five() {
        String expected = "Buzz";
        assertEquals(expected, FizzBuzz.compute(5), "Should Return Buzz");
    }

    @Test
    @Order(3)
    void test_For_Divisible_By_Three_And_Five() {
        String expected = "FizzBuzz";
        assertEquals(expected, FizzBuzz.compute(15), "Should Return FizzBuzz");
    }

    @Test
    @Order(4)
    void test_For_Not_Divisible_By_Three_And_Five() {
        String expected = "7";
        assertEquals(expected, FizzBuzz.compute(7), "Should Return 7");
    }
}
