
# User Management System
#### This is a simple user management system built using the Spring framework. It provides endpoints for adding, updating, getting, and deleting user information.
--------------------

# Frameworks and Language Used
#### The project was built using the following frameworks and languages:

- Spring Boot 2.5.2
- Java 11
- H2 in-memory database
- Spring Data JPA
---------------------------

# Data Flow
### The data flow in this project is as follows:

1. The request is received by the controller.
2. The controller passes the request to the service layer.
3. The service layer interacts with the repository layer to perform CRUD operations on the database.
4. The repository layer interacts with the database to perform the requested operation.
5. The repository layer returns the result to the service layer.
6. The service layer returns the result to the controller.
7. The controller returns the result to the client.

# Functions Used in Each Layer
## Controller Layer
- `addUser`: Adds a new user to the system.
- `getUser`: Retrieves a user by ID.
- `getAllUser`: Retrieves all users in the system.
- `updateUserlnfo`: Updates a user's information.
- `deleteUser`: Deletes a user from the system.

## Service Layer
- `addUser`: Validates the user input and saves the user to the database.
- `getUser`: Retrieves a user from the repository.
- `getAllUser`: Retrieves all users from the repository.
- `updateUserlnfo`: Validates the user input and updates the user in the repository.
- `deleteUser`: Deletes a user from the repository.

## Repository Layer
- `save`: Saves a user to the database.
- `findById`: Finds a user in the database by ID.
- `findAll`: Finds all users in the database.
- `deleteById`: Deletes a user from the database by ID.
-----------------------


# Database Design
#### The system uses the H2 in-memory database, which is created when the application is started. The database has a single table called "user", which has the following columns:

- `id`: The unique identifier for the user.
- `username`: The username of the user.
- `date_of_birth`: The date of birth of the user.
- `email`: The email address of the user.
- `phone_number`: The phone number of the user.
- `created_at`: The date and time when the user was created.
- `updated_at`: The date and time when the user was last updated.
---------------------

# Data Structure Used
#### The data structure used in this project is a plain Java object (POJO) called "User", which has the following properties:

- `id`: The unique identifier for the user.
- `username`: The username of the user.
- `dateOfBirth`: The date of birth of the user.
- `email`: The email address of the user.
- `phoneNumber`: The phone number of the user.
-------------

# Project Summary
##### This project demonstrates how to build a simple user management system using the Spring framework. It provides endpoints for adding, updating, getting, and deleting user information, and uses the H2 in-memory database to persist the data. The project uses a layered architecture, separating the controller, service, and repository layers, and follows good practices for validation and error handling.

# Project Pictures
![picture alt](https://uploadnow.io/f/1jYjzL6/200x150)
![picture alt](https://uploadnow.io/f/YxnSl38/200x150)

