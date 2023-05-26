package org.usach.relationships.association;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    // Each Teacher object has an association with multiple Student objects.
    // This is a one-to-many relationship because one teacher can teach multiple students.

    // The Teacher class has a relationship with the Student class, but they are both still independent entities.
    // They can exist without the other.
    private String name;

    // Teacher --------------> Student
    // (teaches)             (learns from)
    private List<Student> students;

    public Teacher(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    // a teacher can have multiple students, so we use a list to store them
    // teacher (1) ---- (n) students
    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return this.students;
    }

    // In Main.java
    /*
    public class Main {
    public static void main(String[] args) {
        // create teacher object
        Teacher teacher = new Teacher("Mr. Smith");

        // create student objects
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // add students to teacher
        teacher.addStudent(student1);
        teacher.addStudent(student2);

        // print teacher's name and students' names
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Students: ");
        for(Student student : teacher.getStudents()) {
            System.out.println(student.getName());
        }
    }
}
     */
}
