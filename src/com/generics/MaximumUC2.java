package com.generics;

public class MaximumUC2 {
	Float x;
	Float y;
	Float z;
	
	public MaximumUC2(Float x, Float y, Float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Float maximum() {
		return MaximumUC2.maximum(x,y,z);
	}

	public static Float maximum(Float x, Float y, Float z) {
		Float max = x;
		
		if(y.compareTo(max)>0)
			max = y;
		if(z.compareTo(max)>0)
			max = z;
		printMax(x,y,z,max);
		return max;
	}

	public static void printMax(Float x, Float y, Float z, Float max) {
		System.out.println("Max of "+x+", "+y+" and "+z+" is "+max);
	}

}
