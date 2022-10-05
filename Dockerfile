FROM openjdk:11

WORKDIR /app

COPY /target/*.jar /app/simulacao-app.jar

ENTRYPOINT ["java", "-jar", "simulacao-app.jar"]

EXPOSE 80