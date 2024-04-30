package org.example;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordAnalyserTest {

    @Test
    void findLongestWords() {
        //arrange
        WordAnalyser wordAnalyser = new WordAnalyser();
        String input = "Hi Hello Howdy, how are yous?";
        String[] expected = {"Howdy,"};

        //act
        String[] actual = wordAnalyser.findLongestWords(input);

        //assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void findLongestWordsAgain() {
        //arrange
        WordAnalyser wordAnalyser = new WordAnalyser();
        String input = "aaa aaa aaaaa aaaaa aaaaa";
        String[] expected = {"aaaaa", "aaaaa", "aaaaa"};

        //act
        String[] actual = wordAnalyser.findLongestWords(input);

        //assert
        assertArrayEquals(expected, actual);
    }



    @Test
    void calculateLetterFrequency() {
        //arrange
        WordAnalyser wordAnalyser = new WordAnalyser();
        String input = "aaabbbbccccc";
        int expected = 5;
        //act
        Map<Character, Integer> actual = wordAnalyser.calculateLetterFrequency(input);

        //assert

    }
}