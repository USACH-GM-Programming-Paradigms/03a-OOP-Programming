# Association

Association is a relationship between two classes where one class uses the capabilities or features of another class.
It is a "has-a" relationship. It represents that objects are related, but don't necessarily depend on each other to exist.
For example, a Teacher has a Student. They are related but can exist independently.

In association, each object has its own lifecycle and there is no owner. The link between objects can be bi-directional.

This is not enforced by the language itself, and it's up to the programmer to ensure they manage object lifecycles and relationships appropriately.

 ______________________           ______________________
|        Teacher       |         |        Student       |
|----------------------|         |----------------------|
| -name: String        |         | -name: String        |
| -students: List<Student> |     |                      |
|----------------------|         |----------------------|
| +Teacher(String)     |         | +Student(String)     |
| +getName(): String   |         | +getName(): String   |
| +addStudent(Student) |         |                      |
| +getStudents(): List<Student> | |                      |
|______________________|         |______________________|
          ^ 1                                 * ^
          |                                     |
          |_____________________________________|
                            Association

* también se puede escribir como n

This UML diagram shows that a Teacher can associate with zero or more Students and a Student can associate with exactly one Teacher.
This corresponds to the addStudent method in the Teacher class and the list of Student objects in the Teacher class.
The 1 and * in the diagram above denote the cardinality of the association.
The 1 denotes that an association link can only connect to one instance of the Teacher class,
and the * denotes that an association link can connect to zero or more instances of the Student class.

Note: UML diagrams are generally used for visualizing the design of a system and may not always capture every detail of
the actual code. The above diagram, for example, does not show that the Teacher class's constructor initializes
the students list, nor does it show the constructor parameters of Teacher and Student classes.