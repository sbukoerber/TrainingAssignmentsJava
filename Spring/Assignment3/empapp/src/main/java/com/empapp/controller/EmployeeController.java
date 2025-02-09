package com.empapp.controller;

import com.empapp.entities.Employee;
import com.empapp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EmployeeController {
    private EmployeeService service;

    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("employees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.status(HttpStatus.OK).
                body(service.getAllEmployees());
    }

    @PostMapping("employees")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        return ResponseEntity.status(HttpStatus.CREATED).
                body(service.addEmployee(employee));
    }

    @DeleteMapping("employees/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).
                body(service.deleteEmployee(id));
    }

    @PutMapping("employees/{id}")
    public ResponseEntity<Employee> updateEmployee(int id, RequestBody Employee employee) {
        return ResponseEntity.status(HttpStatus.OK).
                body(service.updateEmployee(id, employee));
    }
    @GetMapping(path = "employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(int id) {
        return ResponseEntity.status(HttpStatus.OK).
                body(service.getEmployeeById(id));
    }
}
