package com.example.backendexercise.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendexercise.model.Book;
import com.example.backendexercise.service.BackendExerciseService;


@RestController
@RequestMapping("/api")
public class BackendExerciseController {
	
	BackendExerciseService service;
	
	@RequestMapping(value="/health", method=RequestMethod.GET)
    public String healthCheck() {
        return "HEALTHY";
    }
	
	@RequestMapping(value="/books", method=RequestMethod.POST)
	public Book addBook(Book book) {
		return book;
	}
	
	@RequestMapping(value="/books", method=RequestMethod.GET)
	public Book getBooks() {
		return null;
	}
	
	@RequestMapping(value="/books", method=RequestMethod.DELETE)
	public void removeBooks() {
		
	}

}
