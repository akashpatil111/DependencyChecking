package com.demo;

public class StudentsTesting {
	
	public static void main(String [] args) {
		StudentsDetail s=new StudentsDetail();
		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		t1.setName("Nayan");
		t2.setName("akash");
		
		t1.start();
		t2.start();
		
		
	}

}
