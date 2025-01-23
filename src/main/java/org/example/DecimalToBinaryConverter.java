package org.example;

public class DecimalToBinaryConverter {
    public static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        int num = decimal;

        while (num > 0) {
            binary.append(num % 2);
            num /= 2;
        }

        return binary.reverse().toString();
    }
}