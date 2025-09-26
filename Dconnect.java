package com.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class Dconnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
	    Session ss=sf.openSession();
	    Transaction tx= ss.beginTransaction();
	    
	    Student s=new Student();
	    s.setStud_id(1);
	    s.setName("Nandini");
	    s.setEmail("nandini@gmail.com");
	    s.setAge(22);
	    
	    ss.persist(s);
	    System.out.println("Inserted");
	   
	    tx.commit();
	    ss.close();
	    
	    
	    
	    
	    

	}

}
