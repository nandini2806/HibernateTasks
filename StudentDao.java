package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Student;


public class StudentDao {
	public void InsertData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
		
		String hqlQuery="insert into student(name,email,age,marks)values(:name,:email,:age,:marks)";

		MutationQuery query = ss.createNativeMutationQuery(hqlQuery);
		query.setParameter("name", "Nayan");
		query.setParameter("email", "nayan@gmail.com");
		query.setParameter("age", 24);
		query.setParameter("marks",98);
		query.executeUpdate();
		System.out.println("Data is inserted...");

		tx.commit();
		ss.close();
		

	}
	public void updateData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
		
		String hqlQuery="update Student set name=:name,email=:email where id=:id";
		Query<Student> query=ss.createQuery(hqlQuery);
		query.setParameter("name", "Chetan");
		query.setParameter("email", "chetan@gmail.com");
		query.setParameter("id", 1);
		query.executeUpdate();
		System.out.println("Updated");
		tx.commit();ss.close();
	}
	
	public void deleteData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
		
		
		String hqlQuery="delete from Student where id=:id";
		Query<Student> query=ss.createQuery(hqlQuery);
		query.setParameter("id", 3);
		query.executeUpdate();
		System.out.println("Deleted");
		tx.commit();
		ss.close();

	}
	public void getSingleData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
		
		String hqlQuery="from Student where id=:id";
		Query<Student> query=ss.createQuery(hqlQuery);
		query.setParameter("id", 1);
		List<Student> list=query.list();
		for (Student student : list) {
			System.out.println(student);
		}
		tx.commit();
		ss.close();
	}
		public void getAllData() {
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Student.class);
			SessionFactory sf=cfg.buildSessionFactory();
			Session ss=sf.openSession();
			Transaction tx=ss.beginTransaction();
			
			String hqlQuery="from Student";
			Query<Student> query=ss.createQuery(hqlQuery);
		    List<Student> list=query.list();
		   for (Student student : list) {
			System.out.println(student);
		}
		   tx.commit();
			ss.close();
		
		
	
	}
}
