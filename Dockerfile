FROM openjdk:21
ADD target/userblog-0.0.1-SNAPSHOT.jar userblog.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/userblog.jar"]