package org.usach.relationships.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;

    // Department <>-----------> Employee
    // (employs)                (works for)
    private List<Employee> employees;  // Department has employees

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    // Main.java
/*    public class Main {
        public static void main(String[] args) {
            // create department object
            Department department = new Department("Human Resources");

            // create employee objects
            Employee emp1 = new Employee("Alice");
            Employee emp2 = new Employee("Bob");

            // add employees to department
            department.addEmployee(emp1);
            department.addEmployee(emp2);

            // print department's name and employees' names
            System.out.println("Department: " + department.getName());
            System.out.println("Employees: ");
            for(Employee employee : department.getEmployees()) {
                System.out.println(employee.getName());
            }
        }
    }*/
}
