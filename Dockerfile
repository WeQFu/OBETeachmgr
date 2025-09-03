FROM openjdk:8-jre-alpine

WORKDIR /app

# 将本地的 ruoyi-admin.jar 复制到容器中
COPY ./ruoyi-admin.jar .

# 启动服务
CMD java -jar ruoyi-admin.jar