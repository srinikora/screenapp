FROM openjdk:8
RUN echo 'Lot of cool things'
ADD target/screen-app-1.0.jar screen-app-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","screen-app-1.0.jar"]