package com.tnsif.dayfour.secondPackage;

import com.tnsif.dayfour.firstPackage.Base;

public class Executor {
	public static void main(String[] args) {
		Base b1 = new Base();
		b1.methodPublic();
		b1.varPublic = 41;
		b1.methodPublic();
	}
}