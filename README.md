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

