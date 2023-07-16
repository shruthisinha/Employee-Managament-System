# Employee Management System

This is an Employee Management System implemented using Spring Boot, REST API, MySQL, and a front-end using HTML and CSS.

## Table of Contents

- [Features](#features)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features

- Add a new employee to the system.
- Edit employee details such as name, department, and position.
- Delete an employee from the system.
- View a list of all employees and their details.

## Technologies

- Java
- Spring Boot
- MySQL
- HTML
- CSS

## Getting Started

To get started with the Employee Management System, make sure you have the following software installed on your machine:

- Java Development Kit (JDK) 8 or higher
- MySQL Server
- IDE of your choice (e.g., IntelliJ IDEA, Eclipse)

## Installation

1. Clone the repository:
`https://github.com/shruthisinha/Employee-Managament-System`

3. Create a MySQL database for the project.
git clone https://github.com/your-username/employee-management-system.git

4. Update the database configuration in the `application.properties` file located in the `src/main/resources` directory:

`spring.datasource.url=jdbc:mysql://localhost:3306/EmployeeDB?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false`

`spring.datasource.username=root`

`spring.datasource.password=Manya05$`

`spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect`

`spring.jpa.hibernate.ddl-auto=none`

5. Build the project using Maven or your IDE.

## Usage

1. Start the application.

2. Open a web browser and navigate to `http://localhost:8080` to access the Employee Management System.

3. Use the provided interface to add, edit, delete, and view employee details.

## Contributing

Contributions to the Employee Management System are welcome! If you find any bugs or want to add new features, please open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

