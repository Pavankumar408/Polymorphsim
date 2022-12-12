package com.project.demo.compiletime;

public class bank {
	public void customerdetails(int accno) {
		System.out.println("accont no is="+accno);
	}
	public void customerdetails(String fname,String lastname) {
		System.out.println("fullname="+fname+lastname);
	}
	public void customerdetails(long contactno) {
		System.out.println("contactno="+contactno);
		
	}
	public void customerdetails(String branch) {
		System.out.println("branch is="+branch);
		
	}
	public void customerdetails(String location,int pincode) {
		System.out.println("location is="+location+","+pincode);
	}

}
