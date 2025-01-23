package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample test outputs (you can remove this in production)
        System.out.println("Decimal to Binary Tests:");
        System.out.println("5 => " + convertDecimalToBinary(5)); // 101
        System.out.println("6 => " + convertDecimalToBinary(6)); // 110
        System.out.println("13 => " + convertDecimalToBinary(13)); // 1101
    }

    public static boolean checkForPalindrome(String input) {
        String sanitizedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        StringBuilder reversed = new StringBuilder(sanitizedInput);

        return reversed.reverse().toString().equals(sanitizedInput);
    }

    public static String convertDecimalToBinary(int decimal) {
        return DecimalToBinaryConverter.convertDecimalToBinary(decimal);
    }
}