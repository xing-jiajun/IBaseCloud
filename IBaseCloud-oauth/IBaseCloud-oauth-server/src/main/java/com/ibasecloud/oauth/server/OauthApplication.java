package com.ibasecloud.oauth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 认证授权中心启动类
 *
 * @author 幸佳俊
 */
@SpringBootApplication
public class OauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthApplication.class, args);
    }
}
