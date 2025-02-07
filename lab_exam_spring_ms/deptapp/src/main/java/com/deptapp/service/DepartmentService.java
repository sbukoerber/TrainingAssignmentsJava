package com.deptapp.service;

import com.deptapp.dto.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "department")
public interface DepartmentService {

    @GetMapping("department/{name}")
    public Department getByName(@PathVariable String name);
}
