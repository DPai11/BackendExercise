package com.example.backendexercise.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendexercise.model.Book;
import com.example.backendexercise.service.BackendExerciseService;


@RestController
@RequestMapping("/api")
public class BackendExerciseController {
	@Autowired
	BackendExerciseService service;
	
	@RequestMapping(value="/health", method=RequestMethod.GET)
    public String healthCheck() {
        return "HEALTHY";
    }
	
	@RequestMapping(value="/books", method=RequestMethod.POST)
	public Book addBook(@RequestBody Book book) {
		return service.addBook(book);
	}
	
	@RequestMapping(value="/books", method=RequestMethod.GET)
	public ArrayList<Book> getBooks() {
		return service.getBooks();
	}
	
	@RequestMapping(value="/books", method=RequestMethod.DELETE)
	public void removeBooks() {
		service.removeBooks();
	}

}
