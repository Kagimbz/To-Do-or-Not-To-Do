# To-Do-or-Not-To-Do
A simple, fun and intuitive task management application designed to help you organize and track your tasks with ease

## Overview
`To-Do or Not To-Do` combines a robust Spring Boot backend with a user-friendly Thymeleaf frontend to provide an intuitive platform for managing your tasks.

## Key Features
* __Effortless Task Management__: Create, update and delete tasks with ease.
* __Clear and Intuitive Interface__: Navigate through your tasks with a clean, simple, and responsive design.
* __Seamless Integration__: Built with Spring Boot 3 and Thymeleaf for a smooth and dynamic user experience.
* __Reliable Backend__: Powered by Java Spring Boot for a stable and scalable backend.
* __Persistent Storage__: Uses MySQL for reliable data storage and retrieval.
* __Gradle Build System__: Utilizes Gradle for efficient dependency management and builds.

## Configuration
* __Database__: Ensure that MySQL is set up and configured. Update the application.properties file (inside {project-folder}/src/main/resources) with your database connection details (MySQL username, MySQL password and MySQL database to be used).
* __Port__: By default, the application runs on port 1234. Adjust the port in the application.properties file if needed ('server.port' property).

## Getting Started

To get started, follow these steps:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Kagimbz/To-Do-or-Not-To-Do.git

2. **Navigate to the Project Directory**:
   ```bash
   cd To-Do-or-Not-To-Do

3. **Clean and Build the Application**:
   ```bash
   ./gradlew clean build

4. **Run the Application**:
   ```bash
   ./gradlew bootRun

5. **Access the Application**: Open your web browser and navigate to http://localhost:1234/tasks/.

And that's it! Your task manager is now up and running.    

Feel free to reach out for any questions or feedback.
