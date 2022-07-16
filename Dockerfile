FROM openjdk:8
COPY target/springboot1-0.0.1-SNAPSHOT.jar springboot1-0.0.1-SNAPSHOT.jar
CMD java -jar springboot1-0.0.1-SNAPSHOT.jar