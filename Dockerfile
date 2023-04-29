FROM openjdk:8

EXPOSE 8080

ADD target/sample-gcp-demo.jar sample-gcp-demo.jar

ENTRYPOINT ["java", "-jar", "sample-gcp-demo.jar"]