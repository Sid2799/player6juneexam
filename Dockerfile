FROM openjdk:18.0.1.1
ADD target/player-0.0.1-SNAPSHOT.jar player-0.0.1-SNAPSHOT.jar
EXPOSE 8096
ENTRYPOINT ["java","-jar","player-0.0.1-SNAPSHOT.jar"]