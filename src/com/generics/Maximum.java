package com.generics;

public class Maximum {
	Integer x;
	Integer y;
	Integer z;
	
	public Maximum(Integer x, Integer y, Integer z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Integer maximum() {
		return Maximum.maximum(x,y,z);
	}

	public static Integer maximum(Integer x, Integer y, Integer z) {
		Integer max = x;
		
		if(y.compareTo(max)>0)
			max = y;
		if(z.compareTo(max)>0)
			max = z;
		printMax(x,y,z,max);
		return max;
	}

	public static void printMax(Integer x, Integer y, Integer z, Integer max) {
		System.out.println("Max of "+x+", "+y+" and "+z+" is "+max);
	}

}
