package com.shixiao20160821;

public class Carboat {
	public static String howmuch(int m,int n){
		StringBuilder result = new StringBuilder();
		
		int f=0,b=0,c=0;
		
		f=b*7+2;
		
		int value = m-n;
		
		if(value == 0){
			return "[]";
		}
		
		result.append("[");
		
		for(;(f<=m || f<=n);b++){
			for(c=0;(f<=m || f<n);c++){
				f= c*9+1;
				System.out.println(f);
				System.out.println(b);
				System.out.println(c);
				if((b*7+2) == (c*9+1) && ((f>=m) || (f>=n))){
					result.append("[M: "+f+" B: "+b+" C: "+c+"]");
				}
			}
			f= b*7+2;
		}
		
		result.append("]");
		
		return result.toString();
	}
	
	public static void main(String[] args){
		System.out.println(Carboat.howmuch(1000, 1100));
	}
}
