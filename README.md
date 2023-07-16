# Employee-Managament-System


This is a web application that allows you to manage employee details using a Spring Boot REST API with MySQL as the database backend. The frontend is built using HTML and CSS.

## Prerequisites

- Java Development Kit (JDK) 11 or above
- MySQL database server
- Node.js (for frontend development)

## Setup

1. Clone the repository:
   
2. Create a MySQL database and update the database configuration in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your-database
spring.datasource.username=your-username
spring.datasource.password=your-password

Open a web browser and visit http://localhost:8080 to access the application.

Usage
To view the list of employees, go to the homepage (http://localhost:8080).
To add a new employee, click on the "Add Employee" button and fill in the details in the provided form.
To edit an employee's details, click on the "Edit" button next to the employee in the list and update the information in the form.
To delete an employee, click on the "Delete" button next to the employee in the list.
