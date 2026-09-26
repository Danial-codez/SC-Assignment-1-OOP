# SC Assignment 1 — OOP Concepts in Java

## Objective

The objective of this assignment is to understand and apply fundamental Object-Oriented Programming (OOP) concepts in Java through practical implementation. The assignment focuses on encapsulation, inheritance, polymorphism, abstraction using interfaces, and evaluating and improving AI-generated code.

## Tasks

### Task 1 — Broken Vault: Encapsulation

Implemented a `DigitalWallet` class using encapsulation.

* Private fields are used to protect account information.
* Controlled methods are provided to access and modify the wallet.
* Withdrawal operations validate the amount, PIN, and available balance.

**Package:** `task1`

### Task 2 — Evolving Workforce: Inheritance & Polymorphism

Implemented an employee hierarchy using inheritance and method overriding.

* `Employee` is the parent class.
* `Developer` and `SalesManager` extend `Employee`.
* The `calculatePay()` method is overridden in both subclasses.
* Runtime polymorphism is demonstrated using an `Employee[]` array.

**Package:** `task2`

### Task 3 — Design by Contract: Abstraction via Interface

Implemented a `SmartDevice` interface and two classes that implement it.

* `SmartDevice` defines `turnOn()`, `turnOff()`, and `getStatus()`.
* `SmartBulb` implements the interface and provides brightness control.
* `SmartThermostat` implements the interface and provides temperature control.
* The interface provides a common contract while allowing different implementations.

**Package:** `task3`

### Task 4 — AI Code Review

Reviewed an AI-generated Library System program.

* Identified constructors as one good OOP practice used by the AI-generated code.
* Identified poor encapsulation as one design flaw.
* Corrected the `Book` class by making its fields private and providing controlled access through methods.
* Tested the corrected class using a `Main` class.

**Package:** `task4`

## Project Structure

```text
SC-Assignment-1-OOP
│
├── src
│   └── main
│       └── java
│           ├── task1
│           │   ├── DigitalWallet.java
│           │   └── DigitalWalletTest.java
│           │
│           ├── task2
│           │   ├── Employee.java
│           │   ├── Developer.java
│           │   ├── SalesManager.java
│           │   └── Main.java
│           │
│           ├── task3
│           │   ├── SmartDevice.java
│           │   ├── SmartBulb.java
│           │   ├── SmartThermostat.java
│           │   └── Main.java
│           │
│           └── task4
│               ├── Book.java
│               └── Main.java
│
├── pom.xml
└── README.md
```

## How to Run

1. Clone or download this repository.
2. Open the project in NetBeans.
3. Make sure the project is configured with a compatible Java JDK.
4. Navigate to the required task package.
5. Run the corresponding main/test class:

   * **Task 1:** `DigitalWalletTest.java`
   * **Task 2:** `Main.java`
   * **Task 3:** `Main.java`
   * **Task 4:** `Main.java`
6. Check the output in the NetBeans Output window.

## Technologies Used

* Java
* Object-Oriented Programming
* NetBeans IDE
* Maven
* Git and GitHub

## Author

**Danial Zia**

BSc Software Engineering
UET Peshawar, Abbottabad Campus

