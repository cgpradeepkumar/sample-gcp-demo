FROM openjdk:8

EXPOSE 8080

ADD target/sample-gcp-gateway-0.0.1-SNAPSHOT.jar sample-gcp-gateway.jar

ENTRYPOINT ["java", "-jar", "sample-gcp-gateway.jar"]