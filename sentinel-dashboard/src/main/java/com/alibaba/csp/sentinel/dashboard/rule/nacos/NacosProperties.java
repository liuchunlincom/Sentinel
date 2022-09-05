package com.alibaba.csp.sentinel.dashboard.rule.nacos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Rain
 * ceate time 2022/9/1 18:57
 **/
@Component
@ConfigurationProperties(prefix = "sentinel.nacos")
public class NacosProperties {

    @Value("${sentinel.nacos.server-addr:}")
    String serverAddr;
    @Value("${sentinel.nacos.namespace:}")
    String namespace;
    @Value("${sentinel.nacos.username:}")
    String username;
    @Value("${sentinel.nacos.username:}")
    String password;

    public String getServerAddr() {
        return serverAddr;
    }

    public void setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

}
