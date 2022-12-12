package com.project.demo.compiletime;

public class bankrunner {
	public static void main(String[]args) {
		bank bank=new bank();
		bank.customerdetails(636273845);
		bank.customerdetails("pavan", "kumar");
		bank.customerdetails(9842241526l);
		bank.customerdetails("hosur");
		bank.customerdetails("attible", 635183);
	}

}
