package com.example.backendexercise.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendexercise.model.book;
import com.example.backendexercise.service.BackendExerciseService;


@RestController
@RequestMapping("api")
public class BackendExerciseController {
	@Autowired
	BackendExerciseService service;
	
	@RequestMapping(value="/health", method=RequestMethod.GET)
    public String healthCheck() {
        return "HEALTHY";
    }
	
	@RequestMapping(value="/books", method=RequestMethod.POST)
	@ResponseStatus(code = HttpStatus.CREATED)
	public book addBook(@RequestBody book book) {
		return service.addBook(book);
	}
	
	@RequestMapping(value="/books", method=RequestMethod.GET)
	@ResponseBody
	public ArrayList<book> getBooks() {
		return service.getBooks();
	}
	
	@RequestMapping(value="/books", method=RequestMethod.DELETE)
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void removeBooks() {
		service.removeBooks();
	}

}
