package com.generics;

public class Main {
	public static void main(String[] args) {
		String xstr = "Ant", ystr = "Bat", zstr = "Cat";
		Integer xInt = 897, yInt = 356, zInt = 4;
		Float xFlt = 86.48f, yFlt = 612.65f, zFlt = 45.34f;
		
		new Maximum(xstr,ystr,zstr).maximum();
		new Maximum(xInt,yInt,zInt).maximum();
		new Maximum(xFlt,yFlt,zFlt).maximum();
		
	    Integer [] arr = {2 ,23, 5 ,3 ,45,32};
	    String[] strings = {"abc", "bat", "mat", "xyz"};
	    Double[] d = {44.3 , 332.3 ,554.4 ,335.6, 566.3};
	    
		Maximum.testMaximum(arr);
	    Maximum.testMaximum(strings);
	    Maximum.testMaximum(d);
	}
}
