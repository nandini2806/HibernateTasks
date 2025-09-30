package com.service;

import com.dao.EmployeeDao;

public class EmployeeService {

	public void insertData() {
		EmployeeDao ed=new EmployeeDao(); 
		ed.insertData();
	}
	public void updateData() {
		EmployeeDao ed=new EmployeeDao(); 
		ed.updateData();
	}
	public void deletetData() {
		EmployeeDao ed=new EmployeeDao(); 
		ed.deleteData();
	}
	public void getSingletData() {
		EmployeeDao ed=new EmployeeDao(); 
		ed.getSingleData();
	}
	public void getAllData() {
		EmployeeDao ed=new EmployeeDao(); 
		ed.getAll();
	}
}
