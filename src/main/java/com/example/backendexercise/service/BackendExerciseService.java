package com.example.backendexercise.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.backendexercise.database.localDB;
import com.example.backendexercise.model.book;

@Service
public class BackendExerciseService {
	localDB library = new localDB();
	
	public book addBook(book book) {
		library.addBook(book);
		return book;
	}
	
	public ArrayList<book> getBooks() {
		return library.getLibrary();
	}
	
	public void removeBooks() {
		library.removeBooks();
	}
}
