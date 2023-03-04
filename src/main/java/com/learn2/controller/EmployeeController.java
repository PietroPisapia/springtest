package com.learn2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    
    @GetMapping("/employees")
    public String getEmployees(){
        return "display the list of employees";
    }
}
