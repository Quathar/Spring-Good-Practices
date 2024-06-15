<h1 id="title" align="center">< ✅ > Spring Good Practices</h1>

<img src="img/GoodPractices-Icon.png" align="left" width="192" alt="Chat server Icon"/>

This repository serves as a comprehensive guide to some of the best practices for developing robust, maintainable, and efficient applications using Spring Boot. It encompasses the essential concepts and techniques that are crucial for any Spring Boot student/developer. Below is a detailed list of what this repository includes.

> [!NOTE]
> 🔗 All sections have a link to the corresponding folder

## Content:
### [Dependency Injection Example](https://github.com/Quathar/Spring-Good-Practices/tree/main/src/main/java/com/goodpractices/demo/patterns/di)

Provides a straightforward and concise example demonstrating the concept of dependency injection, highlighting its importance and benefits in achieving loosely coupled and easily testable code.

### [Clean Entities](https://github.com/Quathar/Spring-Good-Practices/tree/main/src/main/java/com/goodpractices/demo/data)

Detailed example of how to create clean and well-structured entities using [Lombok](https://projectlombok.org/).

Focuses on best practices for entity design, such as proper usage of annotations, encapsulation, and maintaining a clear separation of concerns.

### [Clean Services](https://github.com/Quathar/Spring-Good-Practices/tree/main/src/main/java/com/goodpractices/demo/service)

Demonstrates how to build clean and maintainable service layers.
Includes [simple tests](https://github.com/Quathar/Spring-Good-Practices/tree/main/src/test/java/com/goodpractices/demo/service) to emphasize the advantages of constructor injection over field injection, promoting better testability and immutability.

### [Clean Controllers](https://github.com/Quathar/Spring-Good-Practices/tree/main/src/main/java/com/goodpractices/demo/controller)

Guides on creating clean and organized controllers, ensuring they adhere to the principles of single responsibility and separation of concerns.

Examples illustrate how to handle HTTP requests and responses efficiently.

Also an example of a small mapper factory with [Mapstruct](https://mapstruct.org/) for [request and response DTOs](https://github.com/Quathar/Spring-Good-Practices/tree/main/src/main/java/com/goodpractices/demo/model) (Data Transfer Object).

### [Controller Advices](https://github.com/Quathar/Spring-Good-Practices/tree/main/src/main/java/com/goodpractices/demo/advice)

Explains the use of controller advices to handle exceptions globally.
Demonstrates how to create custom response bodies for different types of errors, ensuring a consistent and user-friendly API.

### [View Controller Example](https://github.com/Quathar/Spring-Good-Practices/blob/main/src/main/java/com/goodpractices/demo/controller/view/ViewController.java)

A small but comprehensive example of a view controller.
Includes [HTML and Thymeleaf](https://github.com/Quathar/Spring-Good-Practices/tree/main/src/main/resources/templates) templates to demonstrate how to serve dynamic web pages.
Emphasizes the integration between controllers and views, ensuring a smooth user experience.

### [Postman Calls](https://github.com/Quathar/Spring-Good-Practices/tree/main/postman)

A collection of Postman calls provided to test various endpoints of the application.
Includes examples for GET & POST requests, facilitating easy testing and validation of API functionalities.

### [Gradle and Spring Boot Integration](https://github.com/Quathar/Spring-Good-Practices/blob/main/build.gradle.kts)

The project is built using Gradle, showcasing how to set up and configure a Spring Boot project with Gradle.
Utilizes Spring Boot plugins and starters to streamline development.
