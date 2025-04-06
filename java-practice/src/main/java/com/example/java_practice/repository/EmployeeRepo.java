package com.example.java_practice.repository;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


class Employee {
    // annotation for generating the key type
    String id;
    String name;
    String dept;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

public class EmployeeRepo {

    public static void main(String []arg) {
        Employee e1 = new Employee();
        e1.setId("1");
        e1.setName("test1");
        e1.setDept("IT");

        Employee e2 = new Employee();
        e2.setId("2");
        e2.setName("test2");
        e2.setDept("IT");

        Employee e3 = new Employee();
        e3.setId("3");
        e3.setName("test3");
        e3.setDept("Sales");

        Employee e4 = new Employee();
        e4.setId("4");
        e4.setName("test4");
        e4.setDept("marketing");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);

        Map<String, List<Employee>> hashMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.toList()));
        for(Map.Entry entryMap : hashMap.entrySet()) {
            System.out.println("dept "+entryMap.getKey());
            List<Employee> employees = (List<Employee>) entryMap.getValue();
            System.out.println("employees  ");
            employees.forEach(employee -> {
                System.out.println("employee name is "+employee.getName());
            });
        }
    }
}