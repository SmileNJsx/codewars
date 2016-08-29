package com.shixiao20160821;

public class Vowels {
	public static int getCount(String str){
		return str.replaceAll("(?i)[^aeiou]", "").length();
	}
}
