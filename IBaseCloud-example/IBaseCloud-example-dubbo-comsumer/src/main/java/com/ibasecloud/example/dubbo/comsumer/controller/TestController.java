package com.ibasecloud.example.dubbo.comsumer.controller;

import com.ibasecloud.example.dubbo.provider.api.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试 控制器
 *
 * @author 幸佳俊
 */
@RestController
@RequestMapping(value = "/comsumer")
public class TestController {

    @Reference(version = "1.0.0")
    TestService testService;

    @GetMapping(value = "/dubbo/{test}")
    public String test3(@PathVariable String test) {
        return testService.sayHello(test);
    }

}
