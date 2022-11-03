package com.example.backendexercise.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("author")
	private String author;
	
	@JsonProperty("title")
	private String title;
	 	
	@JsonProperty("yearPublished")
	private String yearPublished;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(String yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	
	
}
