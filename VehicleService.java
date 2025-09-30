package com.service;

import com.dao.VehicleDao;

public class VehicleService {
	public void insertData() {
		VehicleDao vd=new VehicleDao();
		vd.insertData();

	}
	public void updateData() {
		VehicleDao vd=new VehicleDao();
		vd.updateData();

	}
	public void deleteData() {
		VehicleDao vd=new VehicleDao();
		vd.deleteData();

	}
	public void getSingleData() {
		VehicleDao vd=new VehicleDao();
		vd.getSingleData();

	}
	public void getAll() {
		VehicleDao vd=new VehicleDao();
		vd.getAll();

	}


}
