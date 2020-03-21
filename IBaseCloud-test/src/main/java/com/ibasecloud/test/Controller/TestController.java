package com.ibasecloud.test.Controller;

import org.springframework.web.bind.annotation.*;

/**
 * 测试 控制器
 *
 * @author 幸佳俊
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping(value = "/get/{test}")
    public String test(@PathVariable String test) {
        return "test-" + test;
    }

}
