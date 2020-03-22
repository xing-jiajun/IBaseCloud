package com.ibasecloud.example.comsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 实验管理-消费者 启动类
 *
 * @author 幸佳俊
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ExampleComsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleComsumerApplication.class, args);
    }
}
