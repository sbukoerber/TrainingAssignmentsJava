package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    @GetMapping("/hello/{name}/{city}")
    public String helloWorld(@PathVariable String name, @PathVariable String city) {
        return "Hello " + name + " from " + city;
    }
}
