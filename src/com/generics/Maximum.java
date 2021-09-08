package com.generics;

public class Maximum<T extends Comparable<T>> {
	T x,y,z;
	
	public Maximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public T maximum() {
		return Maximum.maximum(x,y,z);
	}

	private static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		
		if(y.compareTo(max)>0)
			max = y;
		if(z.compareTo(max)>0)
			max = z;
		printMax(x,y,z,max);
		return max;
	}

	private static<T extends Comparable<T>> void printMax(T x, T y, T z, T max) {
		System.out.println("Max of "+x+", "+y+" and "+z+" is "+max);
	}
	
}