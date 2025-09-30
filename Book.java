package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int book_id;
	private String book_name;
	private String author_name;
	private String book_category;
	
	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public String getBook_category() {
		return book_category;
	}

	public void setBook_category(String book_category) {
		this.book_category = book_category;
	}

	public Book(int book_id, String book_name, String author_name, String book_category) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.author_name = author_name;
		this.book_category = book_category;
	}

	public Book() {
		
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", author_name=" + author_name
				+ ", book_category=" + book_category + "]";
	}
	

}
