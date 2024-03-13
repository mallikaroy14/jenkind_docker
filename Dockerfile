FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/jenkins-practice.jar .
EXPOSE 8080
ENTRYPOINT ["java","-jar","jenkins-practice.jar"]