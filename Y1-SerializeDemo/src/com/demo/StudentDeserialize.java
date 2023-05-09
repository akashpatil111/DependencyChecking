package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeserialize {

	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\IT TECH\\Desktop\\ser.txt");
			
			ObjectInputStream obj=new ObjectInputStream(fis);
			
			Student s=(Student)obj.readObject();
			obj.close();
			System.out.println(s);
			
			System.out.println("SuccessFully Inserted...");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
