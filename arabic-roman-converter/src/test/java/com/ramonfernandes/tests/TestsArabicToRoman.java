package com.ramonfernandes.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ramonfernandes.Operation.ArabicNumbers;

public class TestsArabicToRoman {


    private ArabicNumbers number;

    @Before
    public void setup() {
        number = new ArabicNumbers();
    }

    @Test
    public void testRomanToArabicFive() {
        assertEquals("V", number.convertArabicToRoman(5));
    }

    @Test
    public void testRomanToArabicThree() {
        assertEquals("III", number.convertArabicToRoman(3));
    }


    @Test
    public void testRomanToArabicEight() {
        assertEquals("XVIII", number.convertArabicToRoman(18));
    }

    @Test
    public void testRomanToArabicFourteen() {
        assertEquals("XIV", number.convertArabicToRoman(14));
    }


    @Test
    public void testRomanToArabicFifteen() {
        assertEquals("XV", number.convertArabicToRoman(15));
    }

    @Test
    public void testRomanToArabicSixteen() {
        assertEquals("XVI", number.convertArabicToRoman(16));
    }

    @Test
    public void testRomanToArabicTwenty() {
        assertEquals("XX", number.convertArabicToRoman(20));
    }

    @Test
    public void testRomanToArabicThreeThousandEightHundredEightyEight() {
        assertEquals("MMMDCCCLXXXVIII", number.convertArabicToRoman(3888));
    }
}
