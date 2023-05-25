package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insertData {
	
	public static void getInsert(String name,int age,String city,int salary) {
		Connection con=Common.getCommon();
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into non(name,age,city,salary)values(?,?,?,?)");
		     ps.setString(1, name);	
		     ps.setInt(2, age);
		     ps.setString(3, city);
		     ps.setInt(4, salary);
			ps.execute();
			
			System.out.println("Done...");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name:= ");
		String name=sc.next();
		System.out.println("Enter Your Age:= ");
		int age=sc.nextInt();
		System.out.println("Enter Your City:= ");
		String city=sc.next();
		System.out.println("Enter Your Salary:= ");
		int sal=sc.nextInt();
		
		getInsert(name,age,city,sal);

		
		
	}

}
