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
spring.datasource.url=jdbc:mysql://employee-management-server.mysql.database.azure.com:3306/employeedb?useSSL=true

spring.datasource.username=admin123

spring.datasource.password=admin123!

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

# Explanation of Project Components

## 1. Maven (`pom.xml`)

**Technology:** Maven

The `pom.xml` file is the project's configuration file. It manages:

* Project dependencies
* Java version
* Build process
* Plugins

Examples of dependencies include:

* Spring Boot
* Spring Data JPA
* MySQL Connector
* Thymeleaf

Maven automatically downloads these libraries when the project is built.

---

## 2. Java (`src/main/java`)

**Technology:** Java

This folder contains the backend source code of the application.

All business logic, controllers, models, repositories, and services are written in Java.

---

## 3. Spring Boot (`EmployeeManagementApplication.java`)

**Technology:** Spring Boot

This is the main class of the application.

Responsibilities:

* Starts the Spring Boot application
* Starts the embedded Tomcat server
* Loads all Spring components automatically

This file acts as the entry point of the application.

---

## 4. Spring MVC (`controller`)

**File:**

```
controller/
└── EmployeeController.java
```

**Technology:** Spring MVC

The controller receives HTTP requests from the browser and returns the appropriate web page.

Example flow:

```
Browser
      │
      ▼
EmployeeController
      │
      ▼
EmployeeService
```

Typical responsibilities:

* Display employee list
* Add employee
* Update employee
* Delete employee

---

## 5. Model (`model/Employee.java`)

**Technology:**

* Java
* Spring Data JPA
* Hibernate

The model represents an Employee entity.

Example fields:

* Employee ID
* Name
* Email
* Salary

Hibernate maps this Java class directly to the Employee table in the MySQL database.

---

## 6. Repository (`repository/EmployeeRepository.java`)

**Technology:**

* Spring Data JPA
* Hibernate

The repository communicates with the database.

It provides built-in methods such as:

* save()
* findAll()
* findById()
* deleteById()

These methods allow database operations without writing SQL queries manually.

Flow:

```
Controller
      │
      ▼
Service
      │
      ▼
Repository
      │
      ▼
MySQL Database
```

---

## 7. Service (`service/EmployeeService.java`)

**Technology:**

* Java
* Spring Boot

The service layer contains the business logic of the application.

Responsibilities:

* Validate data
* Process employee information
* Communicate with the repository layer

Example:

```
Controller
      │
      ▼
EmployeeService
      │
      ▼
EmployeeRepository
```

---

## 8. Database Configuration (`application.properties`)

**Technology:**

* Spring Boot
* MySQL

This file stores application configuration.

It contains:

* Database URL
* Username
* Password
* JPA settings
* Hibernate configuration

Spring Boot reads this file automatically during application startup.

---

## 9. Thymeleaf (`templates`)

**Files:**

```
templates/
├── index.html
└── edit.html
```

**Technology:** Thymeleaf

Thymeleaf is a server-side template engine.

It receives data from the controller and dynamically generates HTML pages.

Example:

```
EmployeeController
        │
        ▼
Employee List
        │
        ▼
index.html
        │
        ▼
Browser
```

---

## 10. HTML

**Files:**

* index.html
* edit.html

**Technology:** HTML

HTML provides the structure of the web pages.

It defines:

* Forms
* Tables
* Buttons
* Text fields
* Headings

---

## 11. CSS (`static/style.css`)

**Technology:** CSS

CSS controls the appearance of the application.

It is used for:

* Colors
* Fonts
* Layout
* Spacing
* Responsive styling

---

## 12. Bootstrap

**Technology:** Bootstrap

Bootstrap provides ready-made UI components such as:

* Buttons
* Forms
* Tables
* Navigation bars
* Cards
* Responsive layouts

It helps create a modern and mobile-friendly user interface with minimal custom CSS.

---

## 13. GitHub

**Technology:** GitHub

GitHub is used to:

* Store the project source code
* Track version history
* Collaborate with team members
* Deploy the application to Azure

Deployment flow:

```
Developer
      │
      ▼
GitHub Repository
      │
      ▼
Azure App Service
```

---

## 14. Azure App Service

**Technology:** Microsoft Azure

Azure App Service hosts the Spring Boot application.

After deployment, users can access the application through a public URL.

Example:

```
https://employee-management-sys.azurewebsites.net
```

---

## 15. Azure Database for MySQL

**Technology:** Azure Database for MySQL

This cloud-hosted MySQL database stores all employee information.

The Spring Boot application connects to this database using the connection details configured in `application.properties` or environment variables.

---

# Application Architecture

```
                User
                  │
                  ▼
      HTML + CSS + Bootstrap
                  │
                  ▼
             Thymeleaf
                  │
                  ▼
       Spring MVC Controller
                  │
                  ▼
          Employee Service
                  │
                  ▼
     Spring Data JPA Repository
                  │
                  ▼
             Hibernate
                  │
                  ▼
      Azure Database for MySQL
```

---

# Summary

This project follows the **Spring Boot MVC architecture**, where each layer has a specific responsibility:

* **Java** implements the application's business logic.
* **Spring Boot** simplifies application development and configuration.
* **Spring MVC** processes HTTP requests and responses.
* **Spring Data JPA** and **Hibernate** manage communication with the MySQL database.
* **Thymeleaf** generates dynamic web pages.
* **HTML, CSS, and Bootstrap** build a responsive and user-friendly interface.
* **Maven** manages project dependencies and builds.
* **GitHub** stores and versions the source code.
* **Azure App Service** hosts the application.
* **Azure Database for MySQL** securely stores employee data in the cloud.


---

# Author

Created as a Spring Boot + Azure deployment project.

---

# License

This project is created for learning and demonstration purposes.
