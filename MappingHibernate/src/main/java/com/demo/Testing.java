package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testing {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("cfg1.xml");
	  	SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
		Transaction t=session.beginTransaction();
	
		Department1 d=new Department1();
        d.setDeptname("Information Technology");
		
		Saroj1 s=new Saroj1();
		s.setFirstname("Prema ");
		s.setLastname("Deokar");
		s.setCity("Nashik");
		s.setAge(32);
		s.setDept(d);

		session.save(s);
		t.commit();
		
		System.out.println("Done....");
		
	}

}
