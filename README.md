# run-springboot-app-with-maven
This is for running Spring Boot Application with Maven using different methods.

## Install Maven and Java, and add system variable to path.

## Test on "localhost:8083"

## Run Spring Boot Application:
	1 Maven CommandLine
		"mvn spring-boot:run"
			
	2 Packaged Apllication Command Line
		Package the application:
			"mvn package"
		Run jar file:
			"java -jar target/test-0.0.1-SNAPSHOT.jar"
			
	3 Docker (2-ways):
		- to create .jar file run "mvn clean package"
	
		### Dockerize Spring Boot Application with basic docker
			- dockerize spring boot aplliction
				- create Dockerfile on root directory:
    
					FROM openjdk:17
					WORKDIR /app
					COPY ./target/test-0.0.1-SNAPSHOT.jar /app
					EXPOSE 8083
					CMD ["java", "-jar", "test-0.0.1-SNAPSHOT.jar"]
     
				- create image:
					run "docker build -t app/test ."
				- create container:
					run "docker run -d -p 8083:8083 --name test  {ImageID}"
				- check if created container:
					run "docker container ps"
				- use Docker Desktop for up/down container.
		
		### Dockerize Spring Boot Apllication using Docker Compose
			- dockerize using Compose Tool
				- create docker-compose.yaml on root directory:
    
					version: '3.8'
					services:
					  app:
						build:
						  context: .
						  dockerfile: Dockerfile
						ports:
						  - "8083:8083" # Map the port from the container to the host
						volumes:
						  - "./target:/app" # Assuming your application uses any form of persistent storage
						restart: on-failure
      
				- run config "docker-compose config"
				- up compose "docker-compose up --build"
				- to remove compose container run "docker-compose down"
				
	refer: 	(Docker) https://www.geeksforgeeks.org/how-to-dockerize-a-spring-boot-application-with-maven/
			    (Spring-Guide Maven) https://spring.io/guides/gs/spring-boot#scratch
