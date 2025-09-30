package com.controller;

import com.service.VehicleService;

public class VehicleController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleService vs=new VehicleService();
		//vs.insertData();
		 //vs.updateData();
		//vs.deleteData();
		 // vs.getSingleData();
		vs.getAll();
		

	}

}
