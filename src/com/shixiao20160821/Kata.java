package com.shixiao20160821;

public class Kata {
	public static int[] digitize(long n){
		return new StringBuilder().append(n)
								  .reverse()
								  .chars()
								  .map(Character::getNumericValue)
								  .toArray();
	}
	
	public static void main(String[] args){
		
		int a[] = Kata.digitize(1213412);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
