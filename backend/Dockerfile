FROM openjdk:17-oracle
ARG JAR_FILE=target/*.jar
COPY ./target/movies-api.jar movies-api.jar
ENTRYPOINT ["java","-jar","/movies-api.jar"]