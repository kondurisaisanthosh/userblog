FROM openjdk:21
ENV SPRING_PROFILES_ACTIVE=${SPRING_PROFILES_ACTIVE}
ADD target/userblog-0.0.1-SNAPSHOT.jar userblog.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/userblog.jar"]