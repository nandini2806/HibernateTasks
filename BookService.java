package com.service;

import com.dao.BookDao;
import com.dao.EmployeeDao;

public class BookService {
	public void insertData() {
		BookDao bd=new BookDao(); 
		bd.insertData();
	}
	public void updateData() {
		BookDao bd=new BookDao(); 
		bd.updateData();
	}
	public void deletetData() {
		BookDao bd=new BookDao(); 
		bd.deleteData();
	}
	public void getSingletData() {
		BookDao bd=new BookDao();  
		bd.getSingleData();
	}
	public void getAll() {
		BookDao bd=new BookDao();  
		bd.getAll();
	}
}
