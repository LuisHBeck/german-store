FROM openjdk:17-alpine

COPY target/gateway-0.0.1-SNAPSHOT.jar gateway.jar

EXPOSE 8766

ENTRYPOINT ["java", "-jar", "gateway.jar"]