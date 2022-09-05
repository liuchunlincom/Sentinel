package com.alibaba.csp.sentinel.dashboard.rule.nacos;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Rain
 * ceate time 2022/9/1 18:57
 **/
@Component
@ConfigurationProperties(prefix = "sentinel.nacos")
public class NacosProperties {

    String serverAddr = "";
    String namespace = "";
    String group = NacosConfigUtil.GROUP_ID;

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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
