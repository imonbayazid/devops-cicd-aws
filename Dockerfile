<<<<<<< HEAD
From tomcat:8.0.51-jre8-alpine
COPY ./target/demo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/demos.war
=======
From tomcat:9.0
RUN cp -R /usr/local/tomcat/webapps.dist/* /usr/local/tomcat/webapps
COPY ./target/finaltest.war /usr/local/tomcat/webapps/finaltest.war
>>>>>>> ab75484afe255101b6c75f52ecb74c71fc6865d4
CMD ["catalina.sh","run"]
