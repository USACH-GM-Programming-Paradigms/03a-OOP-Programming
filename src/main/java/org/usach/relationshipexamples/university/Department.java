package org.usach.relationshipexamples.university;

import java.util.List;

public class Department {

    private String name;

    // Aggregation
    // Department <> --- Professor
    // El rombo va hacia el lado de la clase que CONTIENE a la otra
    private List<Professor> professors;

    public Department(String name, List<Professor> professors) {
        this.name = name;
        this.professors = professors; // Weak relationship, professors object are created outside of this class
    }

    public void hireProfessor(Professor professor) {
        professors.add(professor);
    }
}
