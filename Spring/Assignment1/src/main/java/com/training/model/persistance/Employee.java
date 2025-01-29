package com.training.model.persistance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Employee {
    private int id;
    private String name;
    private String dept;
    private double salary;
}

