package com.demo2;

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
        Transaction t=session.beginTransaction();
		
        
        Address1 a=new Address1();
        a.setCity("Nashik");
        a.setState("Maharashtra");
        a.setCountry("India");
        
        
        Boys1 b1=new Boys1();
        b1.setFirstname("Nayan");
        b1.setLastname("Raut");
        b1.setAge(20);
        b1.setAddress(a);
       
        
        Boys1 b2=new Boys1();
        b2.setFirstname("Akash");
        b2.setLastname("Patil");
        b2.setAge(29);
        b2.setAddress(a);
        
        Boys1 b3=new Boys1();
        b3.setFirstname("Vishal");
        b3.setLastname("Shewale");
        b3.setAge(25);
        b3.setAddress(a);
        
        session.save(b1);
        session.save(b2);
        session.save(b3);
        
        t.commit();
        
        System.out.println("Done...");
        
        
        
        
        
        
   
        
        

	}

}
