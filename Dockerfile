FROM eclipse-temurin:17
WORKDIR /app
 COPY --from=build /app/target/DockerLearning-0.0.1-SNAPSHOT.jar /app/test-docker.jar
ENTRYPOINT ["java","-jar","test-docker.jar"]