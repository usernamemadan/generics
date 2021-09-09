package com.generics;

import java.util.List;

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

	public static <T extends Comparable<T>> void testMaximum(T[] arr) {
       // bubble sort
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j].compareTo(arr[j+1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
		printMax(arr);
	}
	
	private static<T extends Comparable<T>> void printMax(T x, T y, T z, T max) {
		System.out.println("Max of "+x+", "+y+" and "+z+" is "+max);
	}
	
	private static<T extends Comparable<T>> void printMax(T[] arr) {
		System.out.println("Max of elements is " +arr[arr.length-1]);
	}
	
}