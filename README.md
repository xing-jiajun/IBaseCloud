# IBaseCloud


#### 介绍
基于SpringCloud+Mybatis-plus分布式敏捷开发系统，提供整套公共微服务服务模块。


#### 应用目录
|模块|服务名|端口|
|:---|:---:|:---:|
|IBaseCloud|-||
|IBaseCloud-common|-||
|IBaseCloud-dependencies|-||
|IBaseCloud-example|-||
|IBaseCloud-example-provider|example-provider|10201、10202|
|IBaseCloud-example-comsumer|example-comsumer|10301|
|IBaseCloud-oauth|||
|IBaseCloud-oauth-common|||
|IBaseCloud-oauth-dao|||
|IBaseCloud-oauth-service|||
|IBaseCloud-oauth-server|oauth-server|9901|
|IBaseCloud-oauth-api|||

#### 技术环境
|框架|版本|介绍|
|:---:|:---:|:---:|
|Springboot|2.2.0.RELEASE||
|SpringCloud|bcd||
|SpringCloud Alibaba|bcd||
|Spring security|||
|Spring oauth2|||
|Redis|||
|Mybatis|||
|Mybatis-plus|||
|Nacos-Docker|||
|Sentinel||
|Dubbo|||
|RocketMQ|||
|Seata|||

#### 工具环境
|工具|版本|介绍|
|:---:|:---:|:---:|
|IDEA|||
|Postman|||
|Docker|||
|Docker-Compose|||
|Maven|||

#### 服务器环境
192.168.0.100

|软件|运行|
|:---:|:---:|
|Nacos Docker|docker-compose -f /usr/local/docker/nacos-docker/example/standalone-mysql-5.7.yaml up -d|
|Sentinel|java -Dserver.port=8080 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=sentinel-dashboard -jar /usr/local/sentinel/sentinel-dashboard.jar|  

#### 快速启动
启动Nacos-Docker：  
```bash
systemctl start docker  # 启动docker服务
cd /usr/local/docker/nacos-docker/example   # 进入执行目录
docker-compose -f standalone-mysql-5.7.yaml up -d   # 启动nacos
docker-compose -f standalone-mysql-5.7.yaml logs -f # 查看启动日志
docker ps  # 查看容器启动情况
浏览器访问 192.168.0.100:8848/nacos进入管理页面
```
   
启动Sentinel：
```bash

```