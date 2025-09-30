package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;

import com.entity.Employee;

import jakarta.persistence.criteria.Root;

public class EmployeeDao {
	public void insertData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
	    Session ss=sf.openSession();
	    Transaction tx= ss.beginTransaction();
	    
	    Employee e=new Employee();
	    e.setEmpName("Mahesh");
	    e.setEmpDepartment("HR");
	    e.setEmpAge(33);
	    e.setSalary(89000);

	    ss.persist(e);
	    System.out.println("Inserted");
	    
	    tx.commit();
	    ss.close();
	}
	public void updateData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
	    Session ss=sf.openSession();
	    Transaction tx= ss.beginTransaction();
	      
	    int id=2;
		Employee e1=ss.get(Employee.class, 2);
		e1.setEmpDepartment("Testing");
		e1.setEmpName("Aditi");
		
		ss.merge(e1);
		System.out.println("Updated");
		
		tx.commit();
		ss.close();

	}public void deleteData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
	    Session ss=sf.openSession();
	    Transaction tx= ss.beginTransaction();
	    
	    int id=3;
		Employee e1= ss.get(Employee.class, id);
		   
		   ss.remove(e1);
		   System.out.println("Delted");
		   tx.commit();
		   ss.close();

	}
	public void getSingleData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
	    Session ss=sf.openSession();
	    Transaction tx= ss.beginTransaction();
	      
	    int id=2;
		Employee e1= ss.get(Employee.class, id);
		System.out.println(e1);
		
	} 
	public void getAll() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf=cfg.buildSessionFactory();
	    Session ss=sf.openSession();
	    Transaction tx= ss.beginTransaction();
	      
	   HibernateCriteriaBuilder hcb=ss.getCriteriaBuilder();
	   JpaCriteriaQuery cq=hcb.createQuery(Employee.class);
	   Root<Employee> e=cq.from(Employee.class);
	   cq.select(e);
	   
	   Query<Employee> query=ss.createQuery(cq);
	   List<Employee> list=query.list();
	   for (Employee employee : list) {
		System.out.println(employee);
	}
	   
	   
		
	} 

}
