FROM gradle:8.3-jdk20
ARG JAR_FILE=app/build/libs/*.jar
COPY ${JAR_FILE} simple-application.jar
EXPOSE 3000
ENTRYPOINT ["java", "-jar", "simple-application.jar"]