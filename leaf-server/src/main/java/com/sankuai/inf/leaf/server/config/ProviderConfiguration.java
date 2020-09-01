package com.sankuai.inf.leaf.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.sankuai.inf.leaf.server.api")
@ImportResource("classpath:applicationContext-dubbo-provider.xml")
public class ProviderConfiguration {
}
