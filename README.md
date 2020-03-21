# IBaseCloud


#### 介绍
基于SpringCloud+Mybatis-plus分布式敏捷开发系统，提供整套公共微服务服务模块。


#### 应用目录
> IBaseCloud
>> IBaseCloud-common
>> IBaseCloud-register
>> IBaseCloud-config

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
|框架|版本|介绍|
|IDEA|||
|Postman|||
|Docker|||
|Docker-Compose|||
|Maven|||

#### 服务器环境
192.168.0.100

|软件|执行|
|:---:|:---:|
|Nacos Docker||

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
   