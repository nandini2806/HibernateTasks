package com.controller;

import com.service.BookService;

public class BookController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService bs=new BookService();
		//bs.insertData();
		 //bs.updateData();
		 //bs.deletetData();
		// bs.getSingletData();
		bs.getAll();

	}

}
