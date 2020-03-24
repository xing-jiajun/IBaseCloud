package com.ibasecloud.example.dubbo.provider.services.service;

import com.ibasecloud.example.dubbo.provider.api.TestService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {

    public String sayHello(String name) {
        return "Hello " + name + ", 欢迎光临！";
    }
}
