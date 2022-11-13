
# Object Oriented Programming

* An object is instantiation of a class.
* In this class we use UML to design the class diagram.
  * You can use drawio (AKA diagrams.net), MermaidUML or another tool.

## MermaidUML class example:

```mermaid
classDiagram
    class BankAccount
    BankAccount : +String owner
    BankAccount : +Bigdecimal balance
    BankAccount : +deposit(amount)
    BankAccount : +withdrawal(amount)
```