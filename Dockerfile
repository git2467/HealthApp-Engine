# Use an OpenJDK base image for Spring Boot
FROM openjdk:17-jdk-alpine

# Install Keycloak (replace the version with the desired one)
RUN apk add --no-cache curl bash && \
    curl -L https://github.com/keycloak/keycloak/releases/download/25.0.6/keycloak-25.0.6.tar.gz | tar zx -C /opt/ && \
    rm -rf /var/cache/apk/*  # Clean up the apk cache

# Set environment variables for Keycloak
ENV KEYCLOAK_HOME=/opt/keycloak-25.0.6
ENV PATH=$PATH:$KEYCLOAK_HOME/bin

# Expose ports for Spring Boot (9013) and Keycloak (8080)
EXPOSE 9013 8080

# Copy Spring Boot JAR into the container (update with your actual jar file name)
COPY /build/libs/engine-0.0.1-SNAPSHOT.jar /app/app.jar

# Copy the entrypoint script
COPY entrypoint.sh /app/entrypoint.sh

# Copy the keycloak conf file
COPY keycloak.conf $KEYCLOAK_HOME/conf/keycloak.conf

# Make the entrypoint script executable
RUN chmod +x /app/entrypoint.sh

# Debug: Verify the file existence and permissions
RUN ls -l /app/entrypoint.sh

# Set the entry point to the script
ENTRYPOINT ["/app/entrypoint.sh"]