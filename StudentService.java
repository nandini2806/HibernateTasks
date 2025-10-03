package com.service;

import com.dao.StudentDao;

public class StudentService {
	public void insertData() {
		StudentDao dao=new StudentDao();
		dao.InsertData();
	}
	public void deleteData() {
		StudentDao dao=new StudentDao();
		dao.deleteData();
	}
	public void getSingleData() {
		StudentDao dao=new StudentDao();
		dao.getSingleData();
	}
	public void getAllData() {
		StudentDao dao=new StudentDao();
		dao.getAllData();
	}
	public void updateData() {
		StudentDao dao=new StudentDao();
		dao.updateData();
	}

}
