FROM openjdk

WORKDIR /app

COPY target/simulacao-0.0.1-SNAPSHOT.jar /app/simulacao-app.jar

ENTRYPOINT ["java", "-jar", "simulacao-app.jar"]