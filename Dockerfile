FROM openjdk:8
COPY target/springeg1-0.0.1-SNAPSHOT.jar springeg1-0.0.1-SNAPSHOT.jar
CMD java -jar springeg1-0.0.1-SNAPSHOT.jar