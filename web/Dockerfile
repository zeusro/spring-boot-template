FROM openjdk:8-alpine3.8
RUN echo "Asia/Shanghai" > /etc/timezone
LABEL maintainer="xxx@qq.com"
WORKDIR /
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]

