FROM tomcat:latest

ADD ./target/demo*.war /usr/local/tomcat/webapps/demo.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
