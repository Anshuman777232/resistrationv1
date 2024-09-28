package com.api;


import jdk.dynalink.beans.StaticClass;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A {
    public  void main(String[] args){

        List<Employee> employees = Arrays.asList(
                new Employee(1, "mike"),
                new Employee(2, "satallin"),
                new Employee(3, "adam")


        );
        List<EmployeeDto> dtos = employees.stream().map(A:: mapToDto).collect(Collectors.toList());
    }

     static EmployeeDto mapToDto(Employee employee){
        EmployeeDto dto = new EmployeeDto();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        return dto;
    }
}
