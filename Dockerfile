FROM openjdk:8
ADD target/docker-hello.jar docker-hello.jar
EXPOSE 8085
ENTRYPOINT  ["java","-jar","docker-hello.jar"]