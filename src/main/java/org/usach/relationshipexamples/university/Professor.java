package org.usach.relationshipexamples.university;

import java.util.List;

public class Professor {

    private String name;

    private List<Department> departments;

    // A professor is associated with his colleagues
    // Weak relationship
    // The objects "knows" each other
    private List<Professor> colleagues;

    public Professor(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments; // Weak relationship, this object is created outside this class
    }

    // Association: Professor knows other professors
    public void setColleagues(List<Professor> colleagues) {
        this.colleagues = colleagues;
    }
}
