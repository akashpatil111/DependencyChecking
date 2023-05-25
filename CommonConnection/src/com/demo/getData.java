package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class getData {

	public static void getDataa(int id) {
		
		Connection con =Common.getCommon();
		try {
			PreparedStatement  ps=con.prepareStatement("select * from non where id=?");
			ps.setInt(1, id);
			ps.execute();
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("User Id:= "+rs.getInt(1));
				System.out.println("User Name:= "+rs.getString(2));
				System.out.println("User Age:= "+rs.getInt(3));
				System.out.println("User City:= "+rs.getString(4));
				System.out.println("User Salary:= "+rs.getInt(5));
				
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age:= ");
		int age=sc.nextInt();
		getDataa(age);
	}

}
