package com.ibasecloud.example.comsumer.controller;

import com.ibasecloud.example.comsumer.service.ExampleProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 测试 控制器
 *
 * @author 幸佳俊
 */
@RefreshScope
@RestController
@RequestMapping(value = "/comsumer")
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ExampleProviderService exampleProviderService;

    @Value("${userinfo.name}")
    String username;

    @GetMapping(value = "/get/{test}")
    public String test(@PathVariable String test) {
        return "test-" + test;
    }

    @GetMapping(value = "/rest/{test}")
    public String test1(@PathVariable String test) {
        return restTemplate.getForObject("http://example-provider/provider/get/111", String.class);
    }

    @GetMapping(value = "/feign/{test}")
    public String test2(@PathVariable String test) {
        return exampleProviderService.test(test);
    }

    @GetMapping(value = "/config")
    public String test3() {
        return "自动配置获取：user.name：" + username;
    }
}
