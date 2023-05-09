package com.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerialize {

	public static void main(String[] args)  {
		Student s=new Student(101,"Nayan","Pune",56000);
		System.out.println(s);
		FileOutputStream fis;
		try {
			fis = new FileOutputStream("C:\\Users\\IT TECH\\Desktop\\ser.txt");
			
			ObjectOutputStream obj=new ObjectOutputStream(fis);
			
			obj.writeObject(s);
			obj.close();
			
			System.out.println("SuccessFully Inserted...");
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}

}
