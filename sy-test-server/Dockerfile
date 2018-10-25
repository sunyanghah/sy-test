FROM java:8-jre
MAINTAINER sy-test-server

RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo "Asia/shanghai" > /etc/timezone

ADD target/*.jar /app/sy-test-server.jar
CMD ["nohup", "java", "-jar", "-Dspring.profiles.active=dev", "/app/sy-test-server.jar", ">", "/dev/null", "&"]

EXPOSE 8063