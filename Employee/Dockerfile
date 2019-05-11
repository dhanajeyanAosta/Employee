FROM openjdk:11
ADD target/docker-employee.jar docker-employee.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-employee.jar"]