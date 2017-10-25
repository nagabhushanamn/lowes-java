package com.example.demo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@ConditionalOnProperty(name = "location",prefix="lowes")
@Configuration
public class LowesAutoConfiguration {

}
 