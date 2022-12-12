package com.project.demo.compiletime;

public class details {
	public void personaldetails(String name) {
		System.out.println("name is="+name);	
	}
	public void personaldetails(String address,int pincode) {
		System.out.println("address and pincode= "+address+pincode);	
	}
	public void personaldetails(long mobnumber) {
		System.out.println("mobile number is="+mobnumber);
	}
	public void personaldetails(boolean isprovidedrationcard) {
		System.out.println("is provided rationcard="+isprovidedrationcard);
	}
	
}
