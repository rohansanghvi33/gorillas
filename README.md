# gorillas - assessment 

This project uses Spring Webflux along with kotlin graphql library from Expedia Group to build a graphql server to serve the requirements.<br/>
The project also uses H2 - database as in-memory storage for the delivery manifests.<br/>
I have also went a step ahead to dockerise the application. Please follow the steps given below.

### Running the project locally

Step 1 : clone the project repository<br/>
Step 2 : Build the project using maven<br/>
```terminal
#build the project
mvn clean install
```

Step 3 : Run the application from any IDE<br/>
Step 4 : the application is up and listening for requests on PORT 8080<br/>
Step 5 : Use the Postman Script to test out the graphql query and mutations

### Running the project in a docker

Step 1: clone the project repository<br/>
Step 2: Build the project using maven
```terminal
#build the project
mvn clean install
```
Step 3: Build the docker image
``` Docker command
#build a docker image
docker build -t gorilla/graph-kotlin .
```

Step 4: Run the docker image in a container
``` Docker command
#run the docker image
docker run -d -p 8080:8080 gorilla/graph-kotlin
```
Step 5: USe the postman to test all the graphql queries and mutations on localhost:8080
