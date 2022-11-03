package com.example.backendexercise.database;

import java.util.ArrayList;

import javax.persistence.Entity;

import com.example.backendexercise.model.Book;
@Entity
public class LocalDB {
	private ArrayList<Book> library;
	private int idIter;
	public LocalDB() {
		library = new ArrayList<Book>();
		idIter =0;
	}
	public void addBook(Book book) {
		idIter++;
		book.setId(idIter);
		library.add(book);
	}
	
	public void removeBooks() {
		idIter = 0;
		library.clear();
	}
	
	public ArrayList<Book> getLibrary(){
		library.sort((b1, b2)
                -> b1.getTitle().compareToIgnoreCase(
                    b2.getTitle()));
		return library;
	}
}
