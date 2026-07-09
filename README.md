# Employee Management System

A simple Employee Management System built using **Java Spring Boot**, **MySQL**, **Thymeleaf**, and deployed on **Microsoft Azure**.

The application performs basic CRUD (Create, Read, Update, Delete) operations for managing employee information.

---

# Project Overview

The Employee Management System is a web-based application that allows users to:

- Add new employees
- View all employees
- Update employee details
- Delete employees

The application uses Spring Boot as the backend framework, MySQL as the database, and Thymeleaf for displaying dynamic HTML pages.

The application is deployed on Azure App Service and uses Azure Database for MySQL for data storage.

---

# Features

## Employee Management

The application supports:

### Create Employee
- Add employee details through an HTML form.
- Data is stored in MySQL database.

### Read Employee
- Display all employee records on the web page.

### Update Employee
- Edit existing employee information.

### Delete Employee
- Remove employee records from the database.

---

# Technology Stack

| Technology | Purpose |
|------------|---------|
| Java | Backend programming language |
| Spring Boot | Application framework |
| Spring MVC | Handles HTTP requests and controllers |
| Spring Data JPA | ORM and database operations |
| Hibernate | JPA implementation |
| MySQL | Database |
| Thymeleaf | Server-side HTML rendering |
| HTML | Frontend structure |
| CSS | Styling |
| Bootstrap | UI design |
| Maven | Build and dependency management |
| GitHub | Source code management |
| Azure App Service | Application hosting |
| Azure Database for MySQL | Cloud database |

---

# Application Architecture

```
User Browser
      |
      |
      v
Azure App Service
(Spring Boot Application)
      |
      |
      v
Azure Database for MySQL
(employeedb)
```

---

# Project Structure

```
employee-management-system

│
├── pom.xml
│
├── src
│   |
│   └── main
│       |
│       ├── java
│       │   |
│       │   └── com.example.employee
│       │       |
│       │       ├── EmployeeManagementApplication.java
│       │       |
│       │       ├── controller
│       │       │     └── EmployeeController.java
│       │       |
│       │       ├── model
│       │       │     └── Employee.java
│       │       |
│       │       ├── repository
│       │       │     └── EmployeeRepository.java
│       │       |
│       │       └── service
│       │             └── EmployeeService.java
│       |
│       └── resources
│           |
│           ├── application.properties
│           |
│           ├── templates
│           │     ├── index.html
│           │     └── edit.html
│           |
│           └── static
│                 └── style.css
│
└── README.md
```

---

# Database Configuration

The application uses MySQL database.

Database Name:

```
employeedb
```

Azure MySQL Server:

```
employee-mysql-server.mysql.database.azure.com
```

Database table is automatically created using Hibernate:

```
spring.jpa.hibernate.ddl-auto=update
```

---

# Application Configuration

`application.properties`

Example:

```properties
spring.datasource.url=jdbc:mysql://employee-mysql-server.mysql.database.azure.com:3306/employeedb?useSSL=true

spring.datasource.username=admin123

spring.datasource.password=<password>

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

spring.thymeleaf.cache=false
```

---

# Running the Application Locally

## Prerequisites

Install:

- Java JDK 17+
- Maven
- MySQL (if running locally)

---

## Clone Repository

```
git clone https://github.com/nehakalegit/employee-management-system.git
```

Navigate to project folder:

```
cd employee-management-system
```

---

## Build Application

Run:

```
mvn clean install
```

---

## Run Application

Run:

```
mvn spring-boot:run
```

Application starts at:

```
http://localhost:8080
```

---

# CRUD Operations

## Create

Employee data is entered using the employee form.

Example:

```
Name: John
Email: john@gmail.com
Department: IT
```

---

## Read

All employees are displayed on the home page.

---

## Update

Existing employee details can be modified using the Edit option.

---

## Delete

Employee records can be removed using the Delete option.

---

# Azure Deployment

The application is deployed using:

## Azure App Service

Purpose:

- Hosts Spring Boot application
- Provides public URL

## Azure Database for MySQL

Purpose:

- Stores employee information

Deployment flow:

```
GitHub Repository
        |
        |
        v
GitHub Actions
        |
        |
        v
Azure App Service
        |
        |
        v
Azure MySQL Database
```

---

# Deployment Steps

1. Create Azure App Service.

2. Create Azure Database for MySQL Flexible Server.

3. Create database:

```
employeedb
```

4. Configure MySQL firewall rules.

5. Connect App Service with GitHub repository.

6. Configure database environment variables:

```
SPRING_DATASOURCE_URL

SPRING_DATASOURCE_USERNAME

SPRING_DATASOURCE_PASSWORD
```

7. Deploy application using GitHub Actions.

8. Access application using Azure public URL.

---

# Future Improvements

Possible enhancements:

- Add employee login authentication
- Add search functionality
- Add pagination
- Add employee profile pictures
- Add REST API endpoints
- Add Docker support
- Add CI/CD pipeline improvements

---

# Author

Created as a Spring Boot + Azure deployment project.

---

# License

This project is created for learning and demonstration purposes.
