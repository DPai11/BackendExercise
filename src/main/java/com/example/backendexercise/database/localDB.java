package com.example.backendexercise.database;

import java.util.ArrayList;

import javax.persistence.Entity;

import com.example.backendexercise.model.book;
import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
public class localDB {
	@JsonProperty("books")
	private ArrayList<book> library;
	private int idIter;
	public localDB() {
		library = new ArrayList<book>();
		idIter =0;
	}
	public void addBook(book book) {
		idIter++;
		book.setId(idIter);
		library.add(book);
	}
	
	public void removeBooks() {
		idIter = 0;
		library.clear();
	}
	
	public ArrayList<book> getLibrary(){
		library.sort((b1, b2)
                -> b1.getTitle().compareToIgnoreCase(
                    b2.getTitle()));
		return library;
	}
}
