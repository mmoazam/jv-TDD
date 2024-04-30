package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void reverseStringHello() {
        //arrange
        StringManipulator stringManipulator = new StringManipulator();
        String input = "Hello";
        String expected = "olleH";
        //act
        String actual = stringManipulator.reverseString(input);
        //assert
        assertEquals(expected, actual);
    }

    @Test
    void reverseStringHelloT() {
        //arrange
        StringManipulator stringManipulator = new StringManipulator();
        String input = "HelloT";
        String expected = "TolleH";
        //act
        String actual = stringManipulator.reverseString(input);
        //assert
        assertEquals(expected, actual);
    }

    @Test
    void isPalindrome() {
        // arrange
        StringManipulator stringManipulator = new StringManipulator();
        String input = "racecar";
        boolean expected = true;
        // act
        boolean actual = stringManipulator.isPalindrome(input);
        // assert
        assertEquals(expected, actual);
    }

    @Test
    void isNotPalindrome() {
        // arrange
        StringManipulator stringManipulator = new StringManipulator();
        String input = "racecars";
        boolean expected = false;
        // act
        boolean actual = stringManipulator.isPalindrome(input);
        // assert
        assertEquals(expected, actual);
    }
}