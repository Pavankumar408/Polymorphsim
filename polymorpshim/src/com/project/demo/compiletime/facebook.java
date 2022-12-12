package com.project.demo.compiletime;

public class facebook {
public void searchUser(int userid) {
	System.out.println("search for user id found="+userid);
}
public void searchUser(long contactnumber) { 
	System.out.println("search for contact numberfound="+contactnumber);
}
public void searchUser(String fname,String lastname) {
	System.out.println("full name found="+fname+lastname);
}
public void searchUser(String location,int pincode) {
	System.out.println("address found="+location+" "+pincode);
}
}
