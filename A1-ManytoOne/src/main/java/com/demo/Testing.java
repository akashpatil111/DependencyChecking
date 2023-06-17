package com.demo;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testing {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("cfg3.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t =session.beginTransaction();
		
		
		
		Address3 a=new Address3();
		a.setAddName("Sangmeshwar Malegaon ");
		
		Employee3 e1=new Employee3();
		e1.setName("Nayan Raut");
		e1.setCity("Nashik");
		e1.setSalary(24000);
		
		e1.setAdress(a);
		
		
		
		Employee3 e2=new Employee3();
		e2.setName("saroj ferke");
		e2.setCity("mumbai");
		e2.setSalary(35000);
		e2.setAdress(a);
	
		
		Employee3 e3=new Employee3();
		e3.setName("swati gaikwad");
		e3.setCity("malegaon");
		e3.setSalary(44000);
		e3.setAdress(a);
		
		session.save(a);
		session.save(e1);
		session.save(e2);
		session.save(e3);
				
		
		
		t.commit();
		System.out.println("Done");
		
        
		

	}

}
