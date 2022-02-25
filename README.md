# AWS KMS Client Project

This repository contains a mocking web service for simulating integrations with Oracle Hospitality's OPERA 5 Property Management System. 

> :memo: The current revision implements only one method, which simulates getting the general availability for the best available rates. 

## Implementation Overview
We implemented this mocking service using a top-down approach - i.e., starting with the WSDL and generating the Java stubs. We used the following technology stack:
- Java 11
- Spring Boot 2.6.3
- Apache CXF 3.5.0

The build creates a runnable JAR.

## Instructions
1. Download this repo or clone it.
    ```sh
    git clone https://github.com/abelisle-mulesoft/oracle-ows-mock.git
    ```
2. Open a command or shell window and change directory to the root of the project.  
3. Optionally, compile this project as a smoke test.
   1. On Linux or macOS:
       ```sh
       ./mvnw clean compile
       ```
   2. On Windows:
       ```sh 
       mvnw.cmd clean compile
       ```
4. Run the project
   1. On Linux or macOS:
       ```sh
       ./mvnw spring-boot:run
       ```
   2. On Windows:
       ```sh 
       mvnw.cmd spring-boot:run
       ```
    ![Running project screenshot](img/readme-running-project.png)  

5. Optionally, open http://localhost:8081/OWS_WS_51 to view all the endpoints available.
![Available endpoints screenshot](img/readme-available-endpoints.png)

6. Optionally, open http://localhost:8080/OWS_WS_51/Availability?wsdl to view the WSDL.
![WSDL screenshot](img/readme-wsdl.png)



## Reporting Issues

You can report new issues at this link https://github.com/abelisle-mulesoft/oracle-ows-mock/issues.
