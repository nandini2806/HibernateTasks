package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;

import com.entity.Book;

import jakarta.persistence.criteria.Root;
public class BookDao {
	public void insertData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);
		SessionFactory sf=cfg.buildSessionFactory();
	    Session ss=sf.openSession();
	    Transaction tx= ss.beginTransaction();
	    
	    Book b=new Book();
	    b.setAuthor_name("Vishwas Patil");
	    b.setBook_category("Motivational");
	    b.setBook_name("Man Mai Hai Vishwas");

	    ss.persist(b);
	    System.out.println("Inserted");
	    
	    tx.commit();
	    ss.close();
	}
	public void updateData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);
		SessionFactory sf=cfg.buildSessionFactory();
	    Session ss=sf.openSession();
	    Transaction tx= ss.beginTransaction();
	      
	    int id=2;
		Book b1=ss.get(Book.class, 2);
		b1.setBook_category("Love Story");
		ss.merge(b1);
		System.out.println("Updated");
		
		tx.commit();
		ss.close();

	}public void deleteData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);
		SessionFactory sf=cfg.buildSessionFactory();
	    Session ss=sf.openSession();
	    Transaction tx= ss.beginTransaction();
	    
	    int id=4;
		Book b1= ss.get(Book.class, id);
		   
		   ss.remove(b1);
		   System.out.println("Delted");
		   tx.commit();
		   ss.close();

	}
	public void getSingleData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);
		SessionFactory sf=cfg.buildSessionFactory();
	    Session ss=sf.openSession();
	    Transaction tx= ss.beginTransaction();
	      
	    int id=2;
		Book b1= ss.get(Book.class, id);
		System.out.println(b1);
		
	}
	public void getAll() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);
		SessionFactory sf=cfg.buildSessionFactory();
	    Session ss=sf.openSession();
	    Transaction tx= ss.beginTransaction();
	    
	   HibernateCriteriaBuilder hcb= ss.getCriteriaBuilder();
	   JpaCriteriaQuery<Book> cq=hcb.createQuery(Book.class);
	   Root<Book> b=cq.from(Book.class);
	   cq.select(b);
	   Query<Book> query=ss.createQuery(cq);
	   List<Book> list= query.list();
	   for (Book book : list) {
		System.out.println(book);
	}
	   tx.commit();
	   ss.close();
	  
	}

}
