package org.example;



    public class StringManipulator {
        public String reverseString(String input) {
            // TODO: Implement the logic to reverse the input string
            return new StringBuilder(input).reverse().toString();
        }

        public boolean isPalindrome(String input) {
            // TODO: Implement the logic to check if the input string is a palindrome
            String reverse;

            reverse = new StringBuilder(input).reverse().toString();

            return (input.equals(reverse));

            // (A palindrome = same forwards as backwards)

        }
    }


