package com.ramonfernandes.Operation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Numbers {

	Map<String, Integer> mapRomanToArabic = new HashMap<String, Integer>();
	Map<Integer, String> mapArabicToRoman = new HashMap<Integer, String>();
	List romanArray = new ArrayList<Integer>();

	public Numbers() {
		mapRomanToArabic.put("M",1000);
		mapRomanToArabic.put("D", 500);
		mapRomanToArabic.put("C", 100);
		mapRomanToArabic.put("L", 50);
		mapRomanToArabic.put("X", 10);
		mapRomanToArabic.put("IX", 9);
		mapRomanToArabic.put("V", 5);
		mapRomanToArabic.put("IV", 4);
		mapRomanToArabic.put("I", 1);
		mapArabicToRoman.put(1000, "M");
		mapArabicToRoman.put(500, "D");
		mapArabicToRoman.put(100, "C");
		mapArabicToRoman.put(50, "L");
		mapArabicToRoman.put(10, "X");
		mapArabicToRoman.put(9, "X");
		mapArabicToRoman.put(5, "V");
		mapArabicToRoman.put(4, "VI");
		mapArabicToRoman.put(1, "I");

		romanArray.add("M");
		romanArray.add("D");
		romanArray.add("C");
		romanArray.add("L");
		romanArray.add("X");
		romanArray.add("IX");
		romanArray.add("V");
		romanArray.add("IV");
		romanArray.add("I");
	}

	public int exist(char romanNumber) {
		return mapRomanToArabic.get(romanNumber);
	}

	public String exist(int arabicNumber) {
		return mapArabicToRoman.get(arabicNumber);
	}
}
