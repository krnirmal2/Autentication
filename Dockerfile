FROM openjdk
EXPOSE 8080
COPY /target/userservicetestfinal-0.0.1-SNAPSHOT.jar userservicetestfinal-0.0.1-SNAPSHOT.jar
CMD [ "java","-jar","userservicetestfinal-0.0.1-SNAPSHOT.jar" ]