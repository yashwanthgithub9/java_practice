# 1. Start with a base OS that has Java 17 installed
#FROM openjdk:17-jdk-slim
FROM eclipse-temurin:17-jdk-alpine
# 2. Add a temporary volume for file handling
VOLUME /tmp

# 3. Copy the JAR file from your target folder into the container
# Note: You might need to change the name 'identity-service-0.0.1-SNAPSHOT.jar' 
# to match exactly what is in your /target folder.
COPY target/service-registry-0.0.1-SNAPSHOT.jar app.jar

# 4. Tell Docker to run this command when the container starts
ENTRYPOINT ["java", "-jar", "/app.jar"]