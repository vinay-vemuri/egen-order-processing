# Alpine Linux with OpenJDK JRE
FROM openjdk:11.0.6-jre
EXPOSE 8082
# copy WAR into image
COPY target/orderprocessing-0.0.1-SNAPSHOT.jar /app.jar
# run application with this command line
CMD ["java", "-jar","-Dspring.profiles.active=default","/app.jar"]