# Backend Traini8 - Training Center Registry API

This is an MVP for a registry of Government-funded Training Centers built with Spring Boot and MySQL. The application provides APIs to manage training centers, including the ability to create a new training center and retrieve a list of all training centers.

## Requirements

- Java 17
- Maven
- MySQL database

## Setup Instructions

1. **Clone the Repository**

   Clone the repository to your local machine:
   git clone https://github.com/Dhirajgiri18/-Backend_Traini8_DhirajGiri.git

2. **Configure Database**

The project uses MySQL as the database for persisting the training center information.

Ensure that MySQL is installed and running on your machine.
Create a database called traini8_db or modify the name in the configuration file.
Run the following SQL command to create the database (if not already created):

CREATE DATABASE traini8_db;

3. **Configure Database Connection**

Edit the src/main/resources/application.properties file with your MySQL configuration. The default configuration is as follows:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/traini8_db
spring.datasource.username=root
spring.datasource.password=root_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
Ensure that the username (root) and password (root_password) match your MySQL credentials.

4. **Build the Project**

Navigate to the project directory and run the following Maven command to build the project:

mvn clean install

5. Run the Application

To run the application, execute: ./mvnw spring-boot:run


License
This project is licensed under the MIT License.

This `README.md` includes instructions for using MySQL as the database, as well as steps for running the project and testing the APIs using Postman. Let me know if you'd like to add any more details!
