package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.GymUser;

public class GymUserDao {public void InsertData() {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(GymUser.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tx=ss.beginTransaction();
	
	String hqlQuery="insert into gymuser(name,weight,concern)values(:name,:weight,:concern)";

	MutationQuery query = ss.createNativeMutationQuery(hqlQuery);
	query.setParameter("name", "Mahesh");
	query.setParameter("weight", 50);
	query.setParameter("concern", "Weight gain");
	query.executeUpdate();
	System.out.println("Data is inserted...");

	tx.commit();
	ss.close();
	

}
public void updateData() {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(GymUser.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tx=ss.beginTransaction();
	
	String hqlQuery="update GymUser set name=:name where id=:id";
	Query<GymUser> query=ss.createQuery(hqlQuery);
	query.setParameter("name", "Chetan");
	query.setParameter("id", 2);
	query.executeUpdate();
	System.out.println("Updated");
	tx.commit();ss.close();
}

public void deleteData() {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(GymUser.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tx=ss.beginTransaction();
	
	
	String hqlQuery="delete from GymUser where id=:id";
	Query<GymUser> query=ss.createQuery(hqlQuery);
	query.setParameter("id", 3);
	query.executeUpdate();
	System.out.println("Deleted");
	tx.commit();
	ss.close();

}
public void getSingleData() {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(GymUser.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tx=ss.beginTransaction();
	
	String hqlQuery="from GymUser where id=:id";
	Query<GymUser> query=ss.createQuery(hqlQuery);
	query.setParameter("id", 1);
	List<GymUser> list=query.list();
	for (GymUser user: list) {
		System.out.println(user);
	}
	tx.commit();
	ss.close();
}
	public void getAllData() {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(GymUser.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
		
		String hqlQuery="from GymUser";
		Query<GymUser> query=ss.createQuery(hqlQuery);
	    List<GymUser> list=query.list();
	   for (GymUser user : list) {
		System.out.println(user);
	}
	   tx.commit();
		ss.close();
	
	

}

}
