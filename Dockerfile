FROM maven-build-slave-0.1
COPY target/demo-0.0.1.jar app.jar
CMD ["/usr/lib/jvm/java-11-openjdk-amd64/bin/java", "-jar", "app.jar"]

