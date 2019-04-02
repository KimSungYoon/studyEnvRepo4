FROM openjdk:8-jre-alpine
#FROM debian:8.4
#COPY ~/studyEnv4/studyEnvRepo4/target/hello-0.0.1-SNAPSHOT.jar ./hello.jar
ADD . /
EXPOSE 8080
CMD ["/usr/bin/java", "-jar", "/hello-0.0.1-SNAPSHOT.jar"]
#CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "hello.jar"]