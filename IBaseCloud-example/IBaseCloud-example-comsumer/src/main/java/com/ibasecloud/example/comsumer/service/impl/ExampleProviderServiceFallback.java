package com.ibasecloud.example.comsumer.service.impl;

import com.ibasecloud.example.comsumer.service.ExampleProviderService;
import org.springframework.stereotype.Component;

/**
 * 熔断器
 *
 * @author 幸佳俊
 */
@Component
public class ExampleProviderServiceFallback implements ExampleProviderService {

    public String test(String test) {
        return "网络异常！请重试。。";
    }

}
