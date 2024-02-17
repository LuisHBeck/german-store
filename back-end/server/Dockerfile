FROM openjdk:17-alpine

COPY target/server-0.0.1-SNAPSHOT.jar server.jar

EXPOSE 8765

ENTRYPOINT ["java", "-jar", "server.jar"]