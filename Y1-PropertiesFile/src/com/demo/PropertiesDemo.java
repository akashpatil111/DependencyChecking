package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		try {
			FileInputStream fis=new FileInputStream("J:\\firstGitRepository\\Y1-PropertiesFile\\cfg.properties");
			
			Properties p=new Properties();
		    p.load(fis);
		    String username=p.getProperty("username");
		    String password=p.getProperty("password");
		    
		    System.out.println("UserName := "+username);
		    System.out.println("Password := "+password);
		    
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
