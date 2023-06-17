package com.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testing {

	public static void main(String[] args) {
	Configuration cfg=new Configuration ();
	cfg.configure("cfg2.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	
	Company cmy=new Company();
	cmy.setCmpname("TATA");
	
	Car c1=new Car();
	c1.setCarname("BMW");
	c1.setCartype("VIP");
	c1.setCompany(cmy);
	
	Car c2=new Car();
	c2.setCarname("AUDI");
	c2.setCartype("Visited");
	c2.setCompany(cmy);
	
	Car c3=new Car();
	c3.setCarname("FERRaRI");
	c3.setCartype("Simple");
	c3.setCompany(cmy);
	
	//session.save(cmy);
	session.save(c1);
	session.save(c2);
	session.save(c3);
	t.commit();
	
	System.out.println("Done");
	
	

	
	}

}
