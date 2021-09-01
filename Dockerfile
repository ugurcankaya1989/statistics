FROM openjdk:13-jdk-alpine
VOLUME /tmp
COPY target/*.jar statistics.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","/statistics.jar"]