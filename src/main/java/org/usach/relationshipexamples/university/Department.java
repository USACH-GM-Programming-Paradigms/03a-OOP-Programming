package org.usach.relationshipexamples.university;

import java.util.List;

public class Department {

    private String name;

    private List<Professor> professors;

    public Department(String name, List<Professor> professors) {
        this.name = name;
        this.professors = professors; // Weak relationship, professors object are created outside of this class
    }

    public void hireProfessor(Professor professor) {
        professors.add(professor);
    }
}
