# Aggregation

Aggregation is a specialized form of association, which represents an ownership relationship between two classes.
It also signifies a "has-a" relationship but involves a parent-child relationship where the child can exist independently
of the parent.
The child can be associated with multiple parent objects at the same time.
For example, a Department has Employees.
Employee can exist without Department.
Aggregation is also known as a "whole/part" relationship.

For example, a Library has Books. Here, Books can exist without Library.
Aggregation is also known as a "whole/part" relationship.

However, this is not enforced by the language itself, and it's up to the programmer to ensure
they manage object lifecycles and relationships appropriately.

 ____________________________            ______________________
|        Department          |          |        Employee      |
|----------------------------|          |----------------------|
| -name: String              |          | -name: String        |
| -employees: List<Employee> | 1      n |                      |
|----------------------------|<> ------ |----------------------|
| +Department(String)        |          | +Employee(String)    |
| +getName(): String         |          | +getName(): String   |
| +addEmployee(Employee)     |          |                      |
| +getEmployees(): List<Employee> |     |                      |
|____________________________|          |______________________|


In this diagram, the Department class aggregates Employee instances, indicated by the diamond on the Department side of
the line that connects the two classes.
This represents a "has-a" relationship where Department has Employees, but Employees can exist independently of Department.
The 1 and * in the diagram denote the cardinality of the aggregation.
The 1 indicates that an aggregation link can only connect to one instance of the Department class,
and the * indicates that an aggregation link can connect to zero or more instances of the Employee class.