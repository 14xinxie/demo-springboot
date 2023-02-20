package com.webank.springboot;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class DemoService {
    private String name;
    private String content;
    public DemoService(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String say() {
        log.info("DemoService 开始说话...");
        return this.name + ":" + this.content;
    }
}
