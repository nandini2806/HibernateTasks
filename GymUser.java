package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GymUser {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int user_id;
	private String name;
	private int weight;
	private String concern;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getConcern() {
		return concern;
	}
	public void setConcern(String concern) {
		this.concern = concern;
	}
	public GymUser(int user_id, String name, int weight, String concern) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.weight = weight;
		this.concern = concern;
	}
	public GymUser() {
		
	}
	@Override
	public String toString() {
		return "GymUser [user_id=" + user_id + ", name=" + name + ", weight=" + weight + ", concern=" + concern + "]";
	}
	
	
	

}
