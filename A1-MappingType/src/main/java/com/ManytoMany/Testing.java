package com.ManytoMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testing {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("cfg4.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session =sf.openSession();
		Transaction t=session.beginTransaction();
		
		Employe emp1=new Employe();
		emp1.setName("Pranali vankhede");
		emp1.setEmail("pranaliemail@gmail.com");
		
		Employe emp2=new Employe();
		emp2.setName("Pranali vankhede");
		emp2.setEmail("pranaliemail@gmail.com");
		
		Employe emp3=new Employe();
		emp3.setName("Pranali vankhede");
		emp3.setEmail("pranaliemail@gmail.com");
		
		
		Project p1=new Project();
		p1.setProjName("Commartia Project");
		
		Project p2=new Project();
		p2.setProjName("Forex Treding");
		
		Project p3=new Project();
		p3.setProjName("Banking Application");
		
	   
		p1.getEmp().add(emp1);
		p1.getEmp().add(emp2);
		p1.getEmp().add(emp3);
		
		p2.getEmp().add(emp2);
		p2.getEmp().add(emp1);
		
		p3.getEmp().add(emp3);
		p3.getEmp().add(emp1);
		p3.getEmp().add(emp2);
		
		emp1.getP().add(p1);
		emp1.getP().add(p2);
		emp1.getP().add(p3);
		
		emp2.getP().add(p1);
		emp2.getP().add(p2);
		emp2.getP().add(p2);
		
		emp3.getP().add(p1);
		emp3.getP().add(p3);
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		t.commit();
		System.out.println("Done....");
		
		
		
		
		
		
		

	}

}
