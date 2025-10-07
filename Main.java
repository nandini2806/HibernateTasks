package com.entity1;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employeee.class);
		cfg.addAnnotatedClass(Department.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Department d = new Department();
		d.setDeptName("Developer");
		Department d1 = new Department();
		d1.setDeptName("HR");

		Employeee e1 = new Employeee();
		e1.setEmp_id(10001);
		e1.setEmpName("dhiraj");
		e1.setEmpAge(24);
		

		Employeee e2 = new Employeee();
		e2.setEmp_id(10002);
		e2.setEmpName("viraj");
		e2.setEmpAge(28);
		
		Employeee e3 = new Employeee();
		e3.setEmp_id(10003);
		e3.setEmpName("raj");
		e3.setEmpAge(27);
		
		ArrayList<Employeee> list = new ArrayList<Employeee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		d.setEmp(list);

		
		ArrayList<Department> listt = new ArrayList<Department>();
		listt.add(d);
		listt.add(d1);
		
		
		d.setEmp(list);
		d1.setEmp(list);
		e1.setDept(listt);
		e2.setDept(listt);
		e3.setDept(listt);

		ss.persist(d);
		ss.persist(d1);
		ss.persist(e1);
		ss.persist(e2);
		ss.persist(e3);

		System.out.println("Data is inserted...");

		tr.commit();
		ss.close();


	}

}
