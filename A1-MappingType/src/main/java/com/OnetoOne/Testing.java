package com.OnetoOne;

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
        
        Department d=new Department();
        d.setDeptName("IT Department");
        
        
        Student s=new Student();
        s.setName("Akash Patil");
        s.setCity("Hydrabad");
        s.setAge(25);
        s.setDept(d);
        
        session.save(s);
        t.commit();
        
        System.out.println("Done");
        
       
        
	}

}
