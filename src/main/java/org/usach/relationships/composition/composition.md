# Composition

Composition is a strong type of Aggregation.
It's also a "has-a" relationship, but with strong ownership and coincident lifetime of the parts by the whole.
This means that the child object's existence totally depends on the parent's existence.
If the parent object is destroyed, the child object will also be destroyed.
For example, a Car class has an Engine class. The Engine cannot exist without the Car.


 ______________________            ______________________
|        Computer      |          |         CPU         |
|----------------------|          |----------------------|
| -name: String        |          | -model: String       |
| -cpu: CPU            |(1)    (1)|                      |
|----------------------|<->------ |----------------------|
| +Computer(String,    |          | +CPU(String)         |
|          String)     |          | +getModel(): String  |
| +getName(): String   |          |                      |
| +getCPU(): CPU       |          |______________________|
|______________________|

OJO: no necesariamente composición representa una relación 1 a 1
también puede ocurir 1 a N, o N a N


In this UML diagram, the Computer class composes CPU instances, which is indicated by a filled diamond on the Computer
side of the line connecting the two classes.

This represents a "has-a" relationship where Computer has a CPU, and CPU cannot exist independently of Computer.

The / symbol on the line connecting the classes means that Computer entirely manages the lifecycle of CPU,
indicating a composition relationship. If the Computer object is destroyed, the CPU object would also cease to exist.

The 1 and 1 on the lines connecting the classes denote the cardinality of the composition.
The 1 indicates that a composition link can only connect to one instance of the Computer class,
and the 1 indicates that a composition link can connect to one instance of the CPU class.


## Difference between Composition and Aggregation

In code, the main difference between composition and aggregation is how the lifecycle of the 'part' objects is managed.
Both represent "has-a" relationships, but the lifecycles of the 'part' objects are handled differently.

Aggregation: In aggregation, the 'whole' object contains references to 'part' objects, but those 'part' objects have
independent lifecycles. They can be created and destroyed independently of the 'whole' object.
This is generally represented by the 'whole' object having a field that stores the 'part' objects,
but the 'part' objects are not created within the 'whole' object.

## Aggregation Example

```java
public class Department {
    List<Employee> employees;

    public Department() {
        this.employees = new ArrayList<>(); // ACÁ SE INICIALIZA LA LISTA VACIA
    }

    void addEmployee(Employee employee) {
        this.employees.add(employee); // ACÁ AGREGO UNA ENTIDAD CREADA FUERA DE LA CLASE DEPARTAMENT
    }
}
```

```java
public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
}
```

Composition: In composition, the 'whole' object is responsible for the creation and destruction of the 'part' objects.
If the 'whole' object is destroyed, the 'part' objects will also be destroyed.
This is typically represented by the 'whole' object having a field that stores the 'part' objects and also creating
these 'part' objects within its constructor or methods.

In the composition example, the Car is responsible for creating its Engine.
If the Car is destroyed, the Engine will no longer exist, since it's not referenced anywhere else.

## Composition Example

```java
public class Car {
    Engine engine;

    public Car() {
        this.engine = new Engine(); // EL CONSTRUCTOR SE ENCARGA DE INSTANCIAR UN OBJETO DE OTRA CLASE
    }
}
```

```java
public class Engine {
    public Engine() {
    }
}
```

Example 2: Book with Pages

```java
public class Page {
    private String content;

    // constructor
    public Page(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}
```

```java
public class Book {
    private String title;
    private List<Page> pages;  // Book has Pages

    // constructor
    public Book(String title) {
        this.title = title;
        this.pages = new ArrayList<>();  // Pages are composed in Book
    }

    public void addPage(String content) {
        this.pages.add(new Page(content));
    }

    public String getTitle() {
        return this.title;
    }

    public List<Page> getPages() {
        return this.pages;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        // create book object with pages
        Book book = new Book("My Book");
        book.addPage("Page 1 content");
        book.addPage("Page 2 content");

        // print book's title and page contents
        System.out.println("Book: " + book.getTitle());
        for (Page page : book.getPages()) {
            System.out.println("Page content: " + page.getContent());
        }
    }
}
```

The Book class has a composition relationship with the Page class.
The Page instances cannot exist independently of Book.
If the Book object is destroyed, the Page objects will also cease to exist.


## Yeah but book is not an aggregation?

The relationship between Book and Page in the example provided could be considered either aggregation or composition,
depending on the specifics of your application's domain and business rules.

If you consider a Page as an entity that can exist independently of a Book,
for example, in a note-taking application where users can create pages without binding them to a specific book, then it's an aggregation.
Book has a collection of Page objects, but the Page objects can exist independently.

However, if you consider a Page as an entity that only exists as part of a Book, as in a word processing application
where users can't create a page without it being part of some book, then it's a composition.
Book is composed of Page objects, and the Page objects cannot exist without a Book.

In the provided code, Book creates Page instances and manages their lifecycle, which aligns more closely with the concept of composition.
If the Book is destroyed, all of its Page objects are also effectively destroyed because they are not referenced anywhere else.

However, remember that in real-world software applications, the choice between using aggregation or composition
can often depend on the specific behavior and requirements of your system.