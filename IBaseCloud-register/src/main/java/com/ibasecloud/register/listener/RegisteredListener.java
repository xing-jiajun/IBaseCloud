package com.ibasecloud.register.listener;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 服务注册监听器
 *
 * @author 幸佳俊
 */
@Component
public class RegisteredListener implements ApplicationListener<EurekaInstanceRegisteredEvent> {

    public void onApplicationEvent(EurekaInstanceRegisteredEvent eurekaInstanceRegisteredEvent) {
        System.out.println(eurekaInstanceRegisteredEvent.getInstanceInfo().getAppName() + "：服务注册了");
    }

}
