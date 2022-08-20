FROM openjdk:11

WORKDIR /app

COPY /target/*.jar /app/simulacao-app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "simulacao-app.jar"]