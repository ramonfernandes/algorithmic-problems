package com.ramonfernandes.Operation;

public class Main {

    public static void main(String[] args) {
        String[] charPar = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "MMMDCCCLXXXVIII"};
        RomanNumbers num = new RomanNumbers();
        for (String string : charPar) {
            System.out.print(num.convertRomanToArabic(string) + "-");
        }
        Numbers numbers = new Numbers();
        ArabicNumbers arabicNumbers = new ArabicNumbers();
        int[] intPar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i : intPar) {
            System.out.print(arabicNumbers.convertArabicToRoman(i) + "-");
        }
    }
}


