package com.controller;

import com.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeService es=new EmployeeService();
		//es.insertData();
		//es.deletetData();
	    // es.updateData();
		//es.getSingletData();
		es.getAllData();

	}

}
