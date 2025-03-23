package com.cts.learning;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEmployeeSort {
    public static void main(String[] args) {
        // Custom comparator to sort by salary in descending order
        TreeMap<Employee, String> employeeMap = new TreeMap<>(Comparator.comparing(Employee::getSalary).reversed());

        employeeMap.put(new Employee(1, "Alice", 50000), "HR");
        employeeMap.put(new Employee(2, "Bob", 70000), "IT");
        employeeMap.put(new Employee(3, "Charlie", 60000), "Finance");

        for (Map.Entry<Employee, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{ID=" + id + ", Name=" + name + ", Salary=" + salary + "}";
    }
}



