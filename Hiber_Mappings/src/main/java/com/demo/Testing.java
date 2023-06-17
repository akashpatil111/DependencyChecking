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
         
         School s=new School();
         s.setSchname("R.V SHAH Vidhyalaya");
         s.setSchdept("Civil Engineer");
         
         Boy b=new Boy();
         b.setName("Nayan Raut");
         b.setCity("Pune");
         b.setAge(24);
         b.setSchool(s);
         
         session.save(b);
         t.commit();
         
         System.out.println("Done ");
         
       
        
         
	}

}
