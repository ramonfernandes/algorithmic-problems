package com.ramonfernandes.Operation;

import java.util.Map;
import java.util.Map.Entry;

public class ArabicNumbers extends Numbers {
	public String convertArabicToRoman(int arabicNumber) {
		String result = "";
		int index = 0;
		while(arabicNumber != 0) {
			int arabicAlgarism = mapRomanToArabic.get(romanArray.get(index));
			while(arabicAlgarism <= arabicNumber) {
				arabicNumber -= arabicAlgarism;
				result = result + romanArray.get(index);
			}
			index++;
		}
		return result;
	}
}
