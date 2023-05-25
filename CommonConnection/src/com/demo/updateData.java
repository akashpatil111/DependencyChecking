package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class updateData {
	
	public static void getUpdate(String name,int id) {
		Connection con=Common.getCommon();
		
		try {
			PreparedStatement ps=con.prepareStatement("update non set name=? where id=?");
			
			ps.setString(1, name);
			ps.setInt(2, id);
			ps.execute();
			System.out.println("Done");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name:= ");
		String name=sc.next();
		System.out.println("Enter Your Id:= ");
		int id=sc.nextInt();
		
		getUpdate(name,id);
	}

}
