package com.shixiao20160821;

public class ReverseLonger {

	public static String shorterReverseLonger(String a, String b) {
	
	StringBuilder sba = new StringBuilder();
    StringBuilder sbb = new StringBuilder();
    
    sba.append(a);
    sbb.append(b);
    
    if(sba.length() == sbb.length()){
    	return (sbb.append(sba.reverse().append(sbb))).toString();
    }

		if(sba.length() > sbb.length()){
    	return (sbb.append(sba.reverse()).append(sbb)).toString();
    }
    else{
    	return (sba.append(sbb.reverse()).append(sba)).toString();
    }
	}
	
	public static void main(String[] args){
		System.out.println(ReverseLonger.shorterReverseLonger("first", "abcde"));
	}
}
