package com.shixiao20160821;

public class Banjo {
	public static String areYouPlayingBanjo(String name){
		if(name.toUpperCase().startsWith("R"))
			return name + "plays banjo";
		else
			return name + "does not play banjo";
	}
}
