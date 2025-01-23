package org.example;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        // Clean the input as described before
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();
        return cleanedInput.equals(reversedInput);
    }
}