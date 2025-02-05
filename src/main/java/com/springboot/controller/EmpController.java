package com.springboot.controller;

import com.springboot.repo.Employee;
import com.springboot.services.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    private EmployeeService employeeService;

    @GetMapping("employees")
    public ResponseEntity<List<Employee>> getEmployees(){
        return ResponseEntity.status(HttpStatus.OK).body
                (employeeService.getEmployees());
    }

    @Operation(summary = "Get Product by Id",
        description = "Get product by specifying its id",
        tags= {"tutorial", "get"})

    @ApiResponses({
            @ApiResponse(responseCode = "200" , content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = Employee.class))
            }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployeeById(id));
    }

    @PostMapping("employees")
    public ResponseEntity<Employee> addEmployee(@RequestBody @Valid Employee employee){
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.addEmployee(employee));
    }

    @PutMapping("employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody @Valid Employee employee){
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.updateEmployee(id, employee));
    }
    @DeleteMapping("employees/{id}")
    public ResponseEntity<Employee> removeEmployee(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.removeEmployee(id));
    }

}
