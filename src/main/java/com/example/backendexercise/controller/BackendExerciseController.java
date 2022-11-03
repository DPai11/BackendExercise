package com.example.backendexercise.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendexercise.model.book;
import com.example.backendexercise.service.BackendExerciseService;


@RestController
public class BackendExerciseController {
	@Autowired
	BackendExerciseService service;
	
	@RequestMapping(value="api/health", method=RequestMethod.GET)
    public String healthCheck() {
        return "HEALTHY";
    }
	
	@RequestMapping(value="api/books", method=RequestMethod.POST)
	public book addBook(@RequestBody book book) {
		return service.addBook(book);
	}
	
	@RequestMapping(value="api/books", method=RequestMethod.GET)
	public ArrayList<book> getBooks() {
		return service.getBooks();
	}
	
	@RequestMapping(value="api/books", method=RequestMethod.DELETE)
	public void removeBooks() {
		service.removeBooks();
	}

}
