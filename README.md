# WMS API – Warehouse Management System (Spring Boot)

This is a backend application built using **Java Spring Boot** to manage a Warehouse Management System (WMS). It supports full **CRUD operations** for Inventory and Order modules.

---

## Features

- Inventory Management: Add, view, update, delete inventory items
- Order Management: Create, retrieve, update, and delete customer orders
- RESTful API with JSON request/response
- MySQL integration using Spring Data JPA
- Layered architecture (Controller → Service → Repository → DB)
- Postman collection available for testing

---

## Tech Stack

- Java 17  
- Spring Boot 3.x  
- Spring Web  
- Spring Data JPA  
- MySQL  
- Maven  
- Postman (for testing)

---

## Run Locally

### Prerequisites

- Java 17+
- MySQL
- Maven

### Setup

1. **Create MySQL database**
   ```sql
   CREATE DATABASE wms_db;
Configure application.properties

In src/main/resources/application.properties, update with your DB credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/wms_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
Run the application

In Eclipse: Right-click WmsApiApplication.java → Run as → Spring Boot App

OR with Maven:

mvn spring-boot:run

API Endpoints

Inventory

Method	  Endpoint	              Description
GET	    /api/inventory	        Get all inventory
GET	    /api/inventory/{id}    	Get inventory by ID
POST	  /api/inventory	        Add inventory
PUT	    /api/inventory/{id}	    Update inventory
DELETE	/api/inventory/{id}	    Delete inventory

Orders

Method	    Endpoint	          Description
GET	      /api/orders	Get       all orders
GET	      /api/orders/{id}	    Get order by ID
POST	    /api/orders	Create    new order
PUT	      /api/orders/{id}	    Update an order
DELETE	  /api/orders/{id}	    Delete an order

Testing with Postman
You can import the included Postman collection to test all APIs.


Project Structure
css
Copy
Edit
src/
 └── main/
     └── java/
         └── com/pbh/wms/
             ├── controller/
             ├── model/
             ├── repository/
             ├── service/
             └── WmsApiApplication.java
     └── resources/
         └── application.properties







