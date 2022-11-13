package org.usach.relationshipexamples.university;

import java.util.ArrayList;
import java.util.List;

public class University {

    // The relationship between objects is called: association
    // The association can be: strong or weak
    // This depends on how tight are the lifecycles
    // Strong relationship is called: Composition
    // Weak relationship is called: Aggregation

    private String name;

    // University HAS-A lots of departments
    // Relationship type: Composition
    // Strong relationship
    // University is a composition of departments
    // The object lifecycle of departments depends on University
    // The departments is created inside the University object
    // A department can't live outside the University object
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>(); // Strong relationship, professors object are created inside of this class
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

}
