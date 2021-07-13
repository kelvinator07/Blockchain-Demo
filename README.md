# Blockchain DEMO Project

## Steps to Setup the project

1. **Clone the application**

   ```bash
   git clone https://github.com/kelvinator07/Blockchain-Demo.git
   cd Blockchain-Demo
   ```

2. **Create a POSTGRES/MySQL database**

   ```bash
   create database blockchaindb
   ```

3. **Change POSTGRES/MySQL username and password as per your installation**

    + open `src/main/resources/application.properties` file.

    + change `spring.datasource.username` and `spring.datasource.password` properties as per your installation

4. **Run the app locally**

   You can run the spring boot app by typing the following command -

   ```bash
   ./mvnw spring-boot:run
   ```

   The server will start on port 8080.

   You can also package the application in the form of a `jar` file and then run it like so -

   ```bash
   ./mvnw clean package -DskipTests
   java -jar target/blockchain-0.0.1-SNAPSHOT.jar
   ```

5. **Run the app in containers using docker**

   You can create and run the app and database in containers by typing the following command -

   ```bash
   docker-compose up
   ```

   Both the images for the app and databases will be created and run immediately

   The server will start on port 8080, while the database on 5432(Postgres) or 3306(Mysql)

   Stop and remove containers using the following command:
   
   ```bash
   docker-compose down
   ```
   
6. **Default Roles**

   The spring boot app uses role based authorization powered by spring security. 
   
   To add the default roles in the database, I have added a method to populate the db with some default roles on startup

   BlockchainDemoApplication.saveUserRoles(); => ROLE_USER, ROLE_ADMIN, ROLE_MODERATOR

   Any new user who signs up to the app is assigned the `ROLE_USER` by default.


### TODOS

## Dockerize.. Done
## Push To Docker Hub... Done
## Unit Test
## Github Actions... CI/CD
