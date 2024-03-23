FROM openjdk:21
ARG SPRING_PROFILES_ACTIVE
ENV SPRING_PROFILES_ACTIVE=${SPRING_PROFILES_ACTIVE}
ADD target/userblog-0.0.1-SNAPSHOT.jar userblog.jar
ENTRYPOINT ["java", "-jar", "/userblog.jar"]