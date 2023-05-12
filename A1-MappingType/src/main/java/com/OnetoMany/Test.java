package com.OnetoMany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("cfg2.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
        Transaction t=session.beginTransaction();
        
        User u=new User();
        u.setName("Radhika Deokar");
        u.setEmail("Deokar@gmail.com");
        
        
        
        Bank b1=new Bank();
        b1.setBankname("HDFC");
        b1.setU(u);
        
        Bank b2=new Bank();
        b2.setBankname("BOI");
        b2.setU(u);
        
        Bank b3=new Bank();
        b3.setBankname("IDBI");
        b3.setU(u);
        
        Set<Bank> b=new HashSet<Bank>();
        b.add(b1);
        b.add(b2);
        b.add(b3);
        
        u.setBank(b);
        
        session.save(u);
        session.save(b1);
        session.save(b2);
        session.save(b3);
        
        t.commit();
        System.out.println("Done");
	}

}
