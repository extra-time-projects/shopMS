FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/shops-*.jar app.jar
CMD ["java", "-jar", "/app.jar"]