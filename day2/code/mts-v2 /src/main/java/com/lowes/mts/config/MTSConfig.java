package com.lowes.mts.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = { JPAConfig.class })
@ComponentScan(basePackages = { "com.lowes.mts.service","com.lowes.mts.repository" })
public class MTSConfig {

}
