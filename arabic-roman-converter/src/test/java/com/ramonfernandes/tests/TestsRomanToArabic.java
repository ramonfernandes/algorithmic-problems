package com.ramonfernandes.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ramonfernandes.Operation.RomanNumbers;

public class TestsRomanToArabic {

	private RomanNumbers number;
	
	@Before
	public void setup() {
		number = new RomanNumbers();
	}
	
	@Test
	public  void testRomanToArabicFive() {
		assertEquals(5, number.convertRomanToArabic("V"));
	}
	
	@Test
	public  void testRomanToArabicThree() {
		assertEquals(3, number.convertRomanToArabic("III"));
	}
	
	
	@Test
	public  void testRomanToArabicEight() {
		assertEquals(18, number.convertRomanToArabic("XVIII"));
	}
	
	@Test
	public  void testRomanToArabicFourteen() {
		assertEquals(14, number.convertRomanToArabic("XIV"));
	}
	
	
	@Test
	public  void testRomanToArabicFifteen() {
		assertEquals(15, number.convertRomanToArabic("XV"));
	}
	
	@Test
	public  void testRomanToArabicSixteen() {
		assertEquals(16, number.convertRomanToArabic("XVI"));
	}
	
	@Test
	public  void testRomanToArabicTwenty() {
		assertEquals(20, number.convertRomanToArabic("XX"));
	}

	@Test
	public  void testRomanToArabicThreeThousandEightHundreAndEightyEight() {
		assertEquals(3888, number.convertRomanToArabic("MMMDCCCLXXXVIII"));
	}
}
