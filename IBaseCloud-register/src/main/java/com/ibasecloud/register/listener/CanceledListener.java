package com.ibasecloud.register.listener;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 服务下线监听器
 *
 * @author 幸佳俊
 */
@Component
public class CanceledListener implements ApplicationListener<EurekaInstanceCanceledEvent> {

    public void onApplicationEvent(EurekaInstanceCanceledEvent eurekaInstanceCanceledEvent) {
        System.out.println(eurekaInstanceCanceledEvent.getAppName() + "：服务下线了");
    }

}
