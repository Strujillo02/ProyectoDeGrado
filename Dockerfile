FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/proyectoApi-0.0.1-SNAPSHOT.jar
COPY  ${JAR_FILE} proyectoApi.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "proyectoApi.jar"]