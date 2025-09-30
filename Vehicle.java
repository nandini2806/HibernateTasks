package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int v_id;
	private String company;
	private String model;
	private float average;
	private int price;
	
	
	public int getV_id() {
		return v_id;
	}
	public void setV_id(int v_id) {
		this.v_id = v_id;
	}
	public void setCompany(String company) {
		this.company=company;
     }
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany(){
		return company;
	}
	
	public Vehicle(int v_id, String company, String model, float average, int price) {
		super();
		this.v_id = v_id;
		this.company = company;
		this.model = model;
		this.average = average;
		this.price = price;
	}
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vehicle [v_id=" + v_id + ", company=" + company + ", model=" + model + ", average=" + average
				+ ", price=" + price + "]";
	}
	
	
}