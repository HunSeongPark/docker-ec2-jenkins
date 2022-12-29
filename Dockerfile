FROM openjdk:11-jdk
VOLUME /tmp
ARG JAR_FILE=build/libs/DepExample-0.0.1.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar", \
"--spring.config.location=/config/application.properties"]