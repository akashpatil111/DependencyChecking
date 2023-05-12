package com.ManytoOne;

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
	
	     Address a=new Address();
	     a.setAddCity("Mumbai");
	     a.setAddCountry("India");
	     a.setAddState("Maharashtra");
	     a.setAddPincode(423203);
	     
	     Student1 s1=new Student1();
	     s1.setName("Akash Patil");
	     s1.setEmail("iampatilakash111@Gmail.com");
	     s1.setAge(24);
	     s1.setAddress(a);
	     
	     
	     Student1 s2=new Student1();
	     s2.setName("Nayan Raut");
	     s2.setEmail("rautnayan@Gmail.com");
	     s2.setAge(24);
	     s2.setAddress(a);
	     
	     Student1 s3=new Student1();
	     s3.setName("Abhijeet Borse");
	     s3.setEmail("iabhi!21@Gmail.com");
	     s3.setAge(24);
	     s3.setAddress(a);
	     
	    session.save(a);
	    session.save(s1);
	    session.save(s2);
	    session.save(s3);
	    t.commit();
	    System.out.println("done....");
	     
	     
	     
	    
	    
	
	}

}
