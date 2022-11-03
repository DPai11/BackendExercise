package com.example.backendexercise.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.backendexercise.database.LocalDB;
import com.example.backendexercise.model.Book;

@Service
public class BackendExerciseService {
	LocalDB library = new LocalDB();
	
	public Book addBook(Book book) {
		library.addBook(book);
		return book;
	}
	
	public ArrayList<Book> getBooks() {
		return library.getLibrary();
	}
	
	public void removeBooks() {
		library.removeBooks();
	}
}
