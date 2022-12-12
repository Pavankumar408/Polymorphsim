package com.project.demo.runtimemethodoverriding;

public class tester {
	public static void main(String[]args) {
	  father fath=new father();
		fath.marrytoisson();
		son son=new son();
		son.marrytoisson();
		father father2=new son();
		father2.marrytoisson();
	}

}
