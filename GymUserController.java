package com.controller;

import com.service.GymUserService;

public class GymUserController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GymUserService ser=new GymUserService();
		//ser.insertData();
		//ser.updateData();
		//ser.deleteData();
		//ser.getSingleData();
		ser.getAllData();

	}

}
