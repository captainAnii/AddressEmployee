# Employee-Address

The Employee Management System is a RESTful API project implemented using Spring Boot, Spring Data JPA, and MySQL. It provides endpoints to manage employees and their addresses.

## Requirements

- Java 8 or above
- Maven
- MySQL

## Getting Started

1. Clone the repository:
- git clone https://github.com/your-username/employee-management-system.git

2. Create a MySQL database for the project.

3. Configure the database connection in the application.properties file. Update the following properties:
- Properties:
- spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
- spring.datasource.username=your_username
- spring.datasource.password=your_password

4. Build the project:
- cd employee-management-system
- mvn clean install

5. Run the application:
- mvn spring-boot:run
- The application will start running at http://localhost:8080.

6. API Endpoints
#### Employee Endpoints
- GET /employees - Get all employees
- GET /employees/{id} - Get an employee by ID
- POST /employees - Create a new employee
- PUT /employees/{id} - Update an employee by ID
- DELETE /employees/{id} - Delete an employee by ID
#### Address Endpoints
- GET /addresses - Get all addresses
- GET /addresses/{id} - Get an address by ID
- POST /addresses - Create a new address
- PUT /addresses/{id} - Update an address by ID
- DELETE /addresses/{id} - Delete an address by ID
7. Contributing
- Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to create a pull request or submit an issue.

8. License
- This project is licensed under the MIT License.
