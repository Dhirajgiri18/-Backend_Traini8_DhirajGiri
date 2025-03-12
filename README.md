# Backend Traini8 - Training Center Registry API

This is an MVP for a registry of Government-funded Training Centers built with Spring Boot and MySQL. The application provides APIs to manage training centers, including the ability to create a new training center and retrieve a list of all training centers.

## Requirements

- Java 17
- Maven
- MySQL database

## Setup Instructions

### 1. Clone the Repository

   Clone the project to your local machine:

   `git clone https://github.com/Dhirajgiri18/-Backend_Traini8_DhirajGiri.git`


2. **Configure Database**
   
   Ensure that MySQL is installed and running on your machine.
   Create a database called traini8_db or modify the name in the configuration file.

   `CREATE DATABASE traini8_db;`

4. **Configure Database Connection**

   Edit the src/main/resources/application.properties file with your MySQL configuration. The default configuration is as follows:
   
   properties
   
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/traini8_db
   spring.datasource.username=root
   spring.datasource.password=root_password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

5. **Build the Project**

   `mvn clean install`

6. Run the Application

   `./mvnw spring-boot:run`
