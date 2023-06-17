package com.demo1;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testing {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("cfg2.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
        Transaction t=session.beginTransaction();
		
        Employe1 e=new Employe1();
        e.setFirstname("Nayan");
        e.setLastname("Raut");
        e.setCity("Pune");
        e.setAge(26);
        
        Bank1 b1=new Bank1();
        b1.setBankname("HDFC");
        b1.setEmp(e);
        
        Bank1 b2=new Bank1();
        b2.setBankname("IDBI");
        b2.setEmp(e);
        
        Bank1 b3=new Bank1();
        b3.setBankname("BOI");
        b3.setEmp(e);
        
        Set<Bank1> bank=new HashSet<Bank1>();
        bank.add(b1);
        bank.add(b2);
        bank.add(b3);
        
        e.setBank(bank);
        
        session.save(e);
        session.save(b1);
        session.save(b2);
        session.save(b3);
        
        
        t.commit();
        System.out.println("Done....");
        
	}

}
