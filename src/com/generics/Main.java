package com.generics;

public class Main {
	public static void main(String[] args) {
		String xstr = "Ant", ystr = "Bat", zstr = "Cat";
		Integer xInt = 897, yInt = 356, zInt = 4;
		Float xFlt = 86.48f, yFlt = 612.65f, zFlt = 45.34f;
		
		new Maximum(xstr,ystr,zstr).maximum();
		new Maximum(xInt,yInt,zInt).maximum();
		new Maximum(xFlt,yFlt,zFlt).maximum();
	}
}
