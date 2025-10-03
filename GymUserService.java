package com.service;

import com.dao.GymUserDao;

public class GymUserService {
	public void insertData() {
		GymUserDao dao=new GymUserDao();
		dao.InsertData();
	}
	public void deleteData() {
		GymUserDao dao=new GymUserDao();
		dao.deleteData();
	}
	public void getSingleData() {
		GymUserDao dao=new GymUserDao();
		dao.getSingleData();
	}
	public void getAllData() {
		GymUserDao dao=new GymUserDao();
		dao.getAllData();
	}
	public void updateData() {
		GymUserDao dao=new GymUserDao();
		dao.updateData();
	}

}
