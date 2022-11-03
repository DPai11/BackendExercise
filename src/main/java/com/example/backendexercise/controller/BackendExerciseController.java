package com.example.backendexercise.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class BackendExerciseController {
	@RequestMapping(value="/health", method=RequestMethod.GET)
    public String healthCheck() {
        return "HEALTHY";
    }
}
