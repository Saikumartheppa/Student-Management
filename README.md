<h1 align="center"> Student-Management </h1>

>### Framework
* SpringBoot
>### Language
* Java
>### Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer maintains the MySQL as database on which CRUD operations are performed . In this created Interfaces
* **Model** - This layer consists basically various classes required for the project and these classes consists the attributes to be stored.
>### Data Structure

* **Course Model**: The Course model represents the data structure for storing Course information. It typically includes attributes such as ID, name, etc.

* **Subject Model**: The Subject model represents the data structure for storing Subject information. It typically includes attributes such as ID, name, etc.

* **Address Model**: The Address model represents the data structure for storing Address information. It typically includes attributes such as ID, street, etc.

* **Student Model**: The Student model represents the data structure for storing Student information. It typically includes attributes such as ID, name, gender, address, subject, course details, teacher, etc.

* **Teacher Model**: The Teacher model represents the data structure for storing Teacher information. It typically includes attributes such as ID, name, etc.


>### Project Summary

The Student-Management is designed to provide functionality for managing a student platform. It includes features such as fetching students, adding students to the platform, managing student information, and more. The application is built by using Spring Boot and uses MySQL as the database for storing student data. The API endpoints can be explored and tested using Swagger UI.

>### Installation and Usage

* Clone the repository to your local machine.
* Make sure you have Java, Maven, and MySQL installed.
* Set up the database configuration in the application.properties file.
* Run the application using Maven or your preferred IDE.
* Access the API endpoints using Swagger UI by navigating to the appropriate URL (e.g., `http://localhost:8080/swagger-ui.html`).