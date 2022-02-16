From tomcat:9.0
RUN cp -R /usr/local/tomcat/webapps.dist/* /usr/local/tomcat/webapps
COPY ./target/finaltest.war /usr/local/tomcat/webapps/finaltest.war

CMD ["catalina.sh","run"]
