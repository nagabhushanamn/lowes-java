package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.websocket.WebSocketAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.config.MyConfig;
import com.example.demo.service.LowesService;

@SpringBootApplication
@EnableConfigurationProperties(MyConfig.class)
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = null;
		context = SpringApplication.run(Application.class, args);

		LowesService lowesService = context.getBean(LowesService.class);

		lowesService.doService();

	}
}
