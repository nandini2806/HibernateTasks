package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;

import com.entity.Vehicle;

import jakarta.persistence.criteria.Root;

public class VehicleDao {
	public void insertData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicle.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
		
		Vehicle v=new Vehicle();
		v.setCompany("Suzuki");
		v.setModel("Access125");
		v.setAverage(40);
		v.setPrice(160000);
		
		ss.persist(v);
		System.out.println("Inserted");
		
		tx.commit();
		ss.close();
  }
	public void updateData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicle.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
		
		int id=3;
		Vehicle v=ss.get(Vehicle.class, id);
		v.setCompany("Honda");
		v.setModel("Activa125");
		v.setPrice(160000);
		
		ss.merge(v);
		System.out.println("Updated");
		tx.commit();
		ss.close();	
	}
	public void deleteData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicle.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();

		int id=5;
		Vehicle v=ss.get(Vehicle.class, id);
		
		ss.remove(v);
		System.out.println("Deleted");
		tx.commit();
		ss.close();
	}
	public void getSingleData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicle.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();

		int id=3;
		Vehicle v=ss.get(Vehicle.class, id);
		System.out.println(v);

	}
	public void getAll() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vehicle.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
		
		HibernateCriteriaBuilder hcf=ss.getCriteriaBuilder();
		JpaCriteriaQuery<Vehicle> cq=hcf.createQuery(Vehicle.class);
		Root<Vehicle> v=cq.from(Vehicle.class);
		cq.select(v);
		
	    Query<Vehicle> query=	ss.createQuery(cq);
	    List<Vehicle> list=query.list();
	    for (Vehicle vehicle : list) {
			System.out.println(vehicle);
		}
	}
	

}
