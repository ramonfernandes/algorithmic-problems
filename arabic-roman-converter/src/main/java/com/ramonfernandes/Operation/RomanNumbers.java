package com.ramonfernandes.Operation;

import java.util.HashMap;
import java.util.Map;

public class RomanNumbers extends Numbers{
	
	public int convertRomanToArabic(String romanNumber) {
		ArabicNumbers arabicNumbers = new ArabicNumbers();
		int index = 1;
		while(!arabicNumbers.convertArabicToRoman(index).equals(romanNumber))
			index++;
		return index;
	}
}
