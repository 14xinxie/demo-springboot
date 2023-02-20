package com.webank.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@EnableConfigurationProperties(DemoProperties.class)
@ConditionalOnProperty(prefix = "demo", value = "enable", matchIfMissing = true)
public class DemoAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public DemoService demoService(DemoProperties demoProperties) {
        log.info("demoService 自动注入中....");
        return new DemoService(demoProperties.getName(), demoProperties.getContent());
    }
}
