package com.ibasecloud.example.comsumer.service;

import com.ibasecloud.example.comsumer.service.impl.ExampleProviderServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 实验管理-生产者 的声明式rest
 *
 * @author 幸佳俊
 */
@FeignClient(value = "example-provider", fallback = ExampleProviderServiceFallback.class)
public interface ExampleProviderService {

    @GetMapping(value = "/provider/get/{test}")
    String test(@PathVariable(value = "test") String test);
}
