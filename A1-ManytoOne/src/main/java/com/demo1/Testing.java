package com.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testing {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("cfg0.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t =session.beginTransaction();
		
		Employe0 e1=new Employe0();
		e1.setName("Pavan Sharma");
		e1.setCity("pune");
		e1.setSalary(25000);
		e1.setAge(24);
		
		Employe0 e2=new Employe0();
		e2.setName("Sunny Pardeshi");
		e2.setCity("Nashik");
		e2.setSalary(22000);
		e2.setAge(24);
		
		Employe0 e3=new Employe0();
		e3.setName("Nitu Deokar");
		e3.setCity("Mumbai");
		e3.setSalary(55000);
		e3.setAge(24);
		
		Project0 p1=new Project0();
		p1.setProjname("Insurance Domain");
		
		Project0 p2=new Project0();
		p2.setProjname("Banking Domain");
		
		Project0 p3=new Project0();
		p3.setProjname("Forex Treading");
		
		
		p1.getEmploye().add(e1);
		p1.getEmploye().add(e2);
		p1.getEmploye().add(e3);
		
		p2.getEmploye().add(e3);
		p2.getEmploye().add(e2);
		
		
		p3.getEmploye().add(e3);
		p3.getEmploye().add(e2);
		p3.getEmploye().add(e1);
		
		e1.getProject().add(p1);
		e1.getProject().add(p3);
		
		e2.getProject().add(p1);
		e2.getProject().add(p2);
		e2.getProject().add(p3);
		
		e3.getProject().add(p1);
		e3.getProject().add(p2);
		e3.getProject().add(p3);
		
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		
		t.commit();
		System.out.println("Done Dude");
	}

}
