FROM openJdk:11
EXPOSE 8081
ADD target/emp-docker.jar emp-docker.jar
ENTRYPOINT ["java","jar","/emp-docker.jar"]
