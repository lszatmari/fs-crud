FROM openjdk:22-jdk-oracle

VOLUME /tmp

COPY target/*.jar app.jar

ENTRYPOINT [ "java", "-jar", "/app.jar" ]