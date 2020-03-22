package com.ibasecloud.example.provider.Controller;

import org.springframework.beans.factory.annotation.Value;
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
@RequestMapping(value = "/provider")
public class TestController {

    @Value(value = "${server.port}")
    String port;

    @GetMapping(value = "/get/{test}")
    public String test(@PathVariable String test) {
        return "test-" + port + "--" + test;
    }

}
