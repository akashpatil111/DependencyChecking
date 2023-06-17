package com.demo3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testing {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("cfg4.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Employe2 emp1 = new Employe2();
		emp1.setFirstname("Akash");
		emp1.setLastname("Patil");
		emp1.setCity("Nashik");
		emp1.setAge(24);
		Employe2 emp2 = new Employe2();
		emp2.setFirstname("Rajat");
		emp2.setLastname("Kolhe");
		emp2.setCity("Malegaon");
		emp2.setAge(26);
		Employe2 emp3 = new Employe2();
		emp3.setFirstname("Dhiraj");
		emp3.setLastname("Sasane");
		emp3.setCity("Mumbai");
		emp3.setAge(28);
		Project2 pro1 = new Project2();
		pro1.setProjname("Banking Application");
		Project2 pro2 = new Project2();
		pro2.setProjname("Insurance Application");
		Project2 pro3 = new Project2();
		pro3.setProjname("Forex Domain");
		pro1.getEmp().add(emp1);
		pro1.getEmp().add(emp2);
		pro1.getEmp().add(emp3);
		pro2.getEmp().add(emp2);
		pro2.getEmp().add(emp1);
		pro3.getEmp().add(emp3);
		pro3.getEmp().add(emp1);
		pro3.getEmp().add(emp2);
		emp1.getProject().add(pro1);
		emp1.getProject().add(pro2);
		emp1.getProject().add(pro3);
		emp2.getProject().add(pro1);
		emp2.getProject().add(pro2);
		emp2.getProject().add(pro3);
		emp3.getProject().add(pro1);
		emp3.getProject().add(pro3);
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(pro1);
		session.save(pro2);
		session.save(pro3);
		t.commit();
		System.out.println("Done...");
	}
}
