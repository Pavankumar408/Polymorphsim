package com.project.demo.runtimemethodoverriding;

public class testeramazon {
	public static void main(String[]args) {
		amazon ama=new amazon();
		ama.display();
		amazon ama2=new flipcart();
		ama2.display();
	}

}
