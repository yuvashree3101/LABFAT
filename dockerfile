FROM openjdk:17-jdk-slim
# This matches the jar name from your previous terminal output
COPY target/registration-app-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
