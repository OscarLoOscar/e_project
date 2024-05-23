## Shopping Cart Application
### Overview
This project is a demo for a Spring Boot application designed to manage a shopping cart system. It utilizes several dependencies to provide core functionalities such as web services, data persistence, security, and more.

### Dependencies
Below is a list of the dependencies used in this project along with their respective functions:

#### Core Dependencies
- ##### spring-boot-starter-web

  - <b>Function</b>: Provides the core components for building web applications, including RESTful services using Spring MVC.
- ##### spring-boot-starter-json

  - <b>Function</b>: Provides support for JSON processing within Spring Boot applications.
#### Development Tools
- ##### spring-boot-devtools

  - <b>Function</b>: Offers development tools that enhance the development experience, such as automatic restarts and live reload of resources.
- ##### lombok

  - <b>Function</b>: Simplifies Java code by automatically generating boilerplate code like getters, setters, and constructors via annotations.
#### Testing
  - ##### spring-boot-starter-test
    - <b>Function</b>: Provides dependencies for testing Spring Boot applications, including JUnit, Hamcrest, and Mockito.
#### Data Persistence
  - ##### spring-boot-starter-data-jpa

    - <b>Function</b>: Facilitates the integration of Spring Data JPA for database operations, simplifying database access and management.
- ##### spring-boot-starter-data-redis

  - <b>Function</b>: Facilitates the use of Redis as a data store with Spring Data Redis support.
- ##### postgresql

  - <b>Function</b>: PostgreSQL JDBC driver, necessary for connecting and interacting with PostgreSQL databases.
#### Security
- ##### spring-security-core

  - <b>Function</b>: Provides core security functionalities, including authentication and authorization.
- ##### spring-boot-starter-security

  - <b>Function</b>: Integrates Spring Security into the application, offering comprehensive security support.
- ##### spring-boot-starter-oauth2-resource-server

  - <v>Function</v>: Enables the application to function as an OAuth2 resource server, providing secure access to protected resources.
#### JSON Processing
- ##### gson
  - <b>Function</b>: A library for converting Java objects to JSON and vice versa, used for JSON parsing and serialization.
#### API Documentation
- ##### swagger-annotations
  - <b>Function</b>: Provides annotations for documenting RESTful APIs using Swagger.
#### Redis Integration
- ##### redisson-spring-boot-starter
  - <b>Function</b>: Integrates Redisson, a Redis client for Java, with Spring Boot for advanced Redis features like distributed locks and synchronization.
- ##### redisson-spring-data-21
  - <b>Function</b>: Specific to Spring Data Redis v.2.1.x, this provides additional integration and support for Redisson with Spring Data.
#### Validation
- ##### jakarta.validation-api
  - <b>Function</b>: Provides the API for Java Bean Validation (formerly JSR-380), enabling validation of bean properties.
#### Build Plugins
- #### spring-boot-maven-plugin
  - <b>Function</b>: Simplifies the packaging and deployment of Spring Boot applications. The configuration also excludes the lombok dependency from the final build.
#### Java Version
- ##### java.version: 17
#### Usage
To build and run the application, use the following Maven commands:

```bash
# To build the application
mvn clean install

# To run the application
mvn spring-boot:run
```
Ensure that you have PostgreSQL and Redis instances running and properly configured before running the application.