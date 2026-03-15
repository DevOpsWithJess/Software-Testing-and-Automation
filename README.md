# Software Testing and Automation

Author: Jessica Johnson  
Language: Java  
Testing Framework: JUnit 5  

---

## Project Overview

This repository demonstrates automated testing and software quality assurance practices using Java and JUnit 5.

The project focuses on validating application behavior through structured unit tests, enforcing input constraints, and ensuring that services behave correctly under both normal and edge-case conditions.

---

## Features

This project demonstrates several important testing practices:

- Unit testing with JUnit 5
- Input validation and defensive programming
- Test case design
- Automated test execution
- Service-layer testing

---

## Implemented Classes

### Contact.java

Defines the Contact object with validation rules including:

- Unique contact ID
- Maximum character lengths
- Non-null constraints
- Controlled updates to fields

---

### ContactService.java

Manages contact records and enforces validation rules when creating or updating contacts.

Responsibilities include:

- Creating contacts
- Updating contact information
- Ensuring ID uniqueness
- Enforcing validation rules

---

### Unit Tests

JUnit test classes validate both expected behavior and edge cases.

Examples of tested scenarios include:

- Valid contact creation
- Invalid input rejection
- Boundary value testing
- Field update verification
- Exception handling

---

## Project Files
- Contact.java
- ContactService.java
- ContactTest.java
- ContactServiceTest.java


Additional documentation:
software-testing-analysis-report.docx


---

## Technologies Used

- Java
- JUnit 5
- Eclipse IDE

---

## What I Learned

This project reinforced the importance of testing in software development. Writing tests alongside the code helped ensure that the system behaved correctly and prevented small errors from becoming larger defects.

Automated tests also make applications easier to maintain and extend as new features are added.

---

## Course

Southern New Hampshire University  
CS 320 – Software Testing, Automation, and Quality Assurance
