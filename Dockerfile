FROM openjdk:8-jdk-alpine
# VOLUME /tmp
# EXPOSE 8000
# ADD target/*.jar app.jar
# ENV JAVA_OPTS=""
# ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]

WORKDIR /app
COPY ./build/libs/app-selenium-quick-start-java.jar ./app.jar