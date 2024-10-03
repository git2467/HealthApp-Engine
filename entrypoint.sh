#!/bin/bash
# Start Keycloak in the background
$KEYCLOAK_HOME/bin/kc.sh start-dev &
# Wait for a few seconds to give Keycloak time to start
sleep 15  # Adjust the duration (in seconds) as needed

# Start Spring Boot app
java -jar /app/app.jar