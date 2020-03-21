# 配置
阿里云-容器镜像服务-镜像加速器（免费）：
```bash
mkdir /etc/docker
sudo tee /etc/docker/daemon.json <<-'EOF'
{
  "registry-mirrors": ["https://37pbptg0.mirror.aliyuncs.com"]
}
EOF
sudo systemctl daemon-reload
sudo systemctl restart docker 
```

# 常用命令
##### 执行  
> systemctl start docker：启动docker  
systemctl status docker：查看docker启动情况  
systemctl restart docker：重启docker

##### docker状态  
> docker system df：镜像体积  
docker version：查看docker的版本

##### 镜像操作  
> docker image [prune]：清除所有的虚玄镜像
> docker images [-a] [--help]：查看docker镜像列表，options：[-a：显示所有镜像] [--help：查看帮助文档]   
> docker pull xxx：xxx下载xxx镜像  
> docker run [-p 8080:8081] [-d] [--name aaa] xxx：启动xxx镜像的容器，[以8081运行且可通过宿主机的8080访问，第一次启动时指定]，[容器名为aaa，第一次启动时指定] [-d 以守护态进行，即后台运行]   
> docker rmi xxx：通过镜像名、id删除镜像  

##### 容器操作  
> docker ps [-a]：查看容器列表[-a：包括运行和没运行的容器]  
> docker stop xxx：停止运行的xxx容器  
> docker start xxx：启动未运行的xxx容器  
> docker rm [-f] xxx：删除xxx容器[-f：强制删除容器，即使容器在运行]  
> docker container prune：删除所有已经停止的容器

##### 宿主机容器交互操作
> docker exec -it xxx /bin/bash：进入xxx容器的虚拟机  
> ctrl + d：从xxx容器的虚拟机退回宿主机

# Dockerfile 定制镜像
##### 构建
> docker build [-t xxx] [path]：[path路径下]找到dockerfile文件，构建[名为xxx]镜像，

##### 编写
> FROM XXX：继承XXX镜像  
> RUN [commonds]：执行bash命令  
> COPY [sourcePath] [targetPath]：复制[dockerfile上下文环境的路径文件]到[docker server 中目标路径]下  
> ADD [sourcePath] [targetPath]：与COPY作用一致，但复制后如果是压缩包会自动解压。  
> CMD [commonds]：执行命令，只允许用一次  
> ENTRYPOINT [commonds]：与CMD命令一致  
> EVN [key] [value]：定义环境变量名为key，值为value  
> VOLUME：数据卷  
> EXPOSE [port]：容器暴露指定port端口  
> WORKDIR [path]:  指定工作目录为[path]  

# Docker Compose
dockercompose.yml文件组成
> version xx：版本  
>> services：  
>>> aaa:   
>>>> restart：启动容器自动开启  
>>>> image：镜像名  
>>>> container_name：容器名  
>>>> volumes：数据卷  
>>>> enviroment： 环境变量  
>>>> ports: 端口映射  
>>>>> - 8888:8888  

