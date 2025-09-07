package edu.citadel.hw1;

import java.time.LocalDate;

/**
 * An abstract class representing an employee, it implements
 * Comparable<Employee></Employee>.
 */
public abstract class Employee implements Comparable<Employee> {
    private String name;
    private LocalDate hireDate;

    //constructor initializing name and hireDate
    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    //getter for name
    //use lombok here?
    public String getName() {
        return name;
    }

    //getter for hireDate
    //use lombok here?
    public LocalDate getHireDate() {
        return hireDate;
    }


}
