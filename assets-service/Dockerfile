FROM adoptopenjdk/openjdk11:alpine-jre
RUN apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/assetsservice
COPY ./target/assets-service-assignment12-0.0.1-SNAPSHOT.jar /usr/local/assetsservice
ENTRYPOINT ["java","-jar","/usr/local/assetsservice/assets-service-assignment12-0.0.1-SNAPSHOT.jar"]