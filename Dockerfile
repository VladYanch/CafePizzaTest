#FROM openjdk:17
#COPY . /usr/src/myapp
#WORKDIR /usr/src/myapp
#RUN javac /src/main/java/com/example/cafepizza/CafePizzaApplication.java
#CMD ["java", "CafePizzaApplication"]
FROM eclipse-temurin:17-jdk-alpine
COPY target/ProjectCafePizza-0.0.1-SNAPSHOT.jar caffepizzatest.jar
ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","/caffepizzatest.jar"]