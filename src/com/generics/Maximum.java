package com.generics;

public class Maximum {
	String x;
	String y;
	String z;
	
	public Maximum(String x, String y, String z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String maximum() {
		return Maximum.maximum(x,y,z);
	}

	public static String maximum(String x, String y, String z) {
		String max = x;
		
		if(y.compareTo(max)>0)
			max = y;
		if(z.compareTo(max)>0)
			max = z;
		printMax(x,y,z,max);
		return max;
	}

	public static void printMax(String x, String y, String z, String max) {
		System.out.println("Max of "+x+", "+y+" and "+z+" is "+max);
	}

}
