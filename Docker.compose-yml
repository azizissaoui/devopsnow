# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/your-app.jar your-app.jar

# Define the command to run when the container starts
CMD ["java", "-jar", "your-app.jar"]
