package com.alibaba.csp.sentinel.dashboard.rule.nacos;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.alibaba.csp.sentinel.dashboard.datasource.entity.gateway.ApiDefinitionEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRulePublisher;
import com.alibaba.csp.sentinel.datasource.Converter;
import com.alibaba.csp.sentinel.util.AssertUtil;
import com.alibaba.nacos.api.config.ConfigService;

/**
 * @author Rain
 * ceate time 2022/9/1 15:56
 **/
@Component("gateWayApiNacosPublisher")
public class GateWayApiNacosPublisher implements DynamicRulePublisher<List<ApiDefinitionEntity>> {
    @Autowired
    private ConfigService configService;
    @Autowired
    private Converter<List<ApiDefinitionEntity>, String> converter;
    @Override
    public void publish(String app, List<ApiDefinitionEntity> rules) throws Exception {
        AssertUtil.notEmpty(app, "app name cannot be empty");
        if (rules == null) {
            return;
        }
        configService.publishConfig(app+ NacosConfigUtil.API_DATA_ID_POSTFIX,
                NacosConfigUtil.GROUP_ID,converter.convert(rules));
    }
}
