package com.ibasecloud.register.listener;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 服务续约心跳检测监听器
 *
 * @author 幸佳俊
 */
@Component
public class RenewedListener implements ApplicationListener<EurekaInstanceRenewedEvent> {

    public void onApplicationEvent(EurekaInstanceRenewedEvent eurekaInstanceRenewedEvent) {
        System.out.println(eurekaInstanceRenewedEvent.getAppName() + "：服务续约成功");
    }
}
