FROM eclipse-temurin:17-jdk-alpine
COPY target/ProjectCafePizza-0.0.1-SNAPSHOT.jar caffepizzatest.jar
ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","/caffepizzatest.jar"]