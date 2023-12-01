# TEP-Back
 Sección Back del proyecto Tu Empleado Perfecto, habilitado de manera publica para fines que estimen convenientes

Requirements
For building and running the application you need:

JDK 18
Maven 3.8
PostgreSQL
You will need to setup your own database or create a database with the following configuration

spring.jpa.database=POSTGRESQL
spring.sql.init.platform=postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/TEP-db
spring.datasource.username=postgres
spring.datasource.password=admin
Running the application locally

Alternatively you can use the Spring Boot Maven plugin like so:

mvn spring-boot:run
Running port
default spring boot config http://localhost:8080/
Swagger url
default swagger url http://localhost:8080/swagger-ui/