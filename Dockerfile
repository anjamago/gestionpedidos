FROM eclipse-temurin:17.0.11_9-jre-ubi9-minimal
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 3158
ENTRYPOINT ["java","-jar","/app.jar"]
