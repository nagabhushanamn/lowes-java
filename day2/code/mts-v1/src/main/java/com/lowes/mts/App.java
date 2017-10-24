package com.lowes.mts;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lowes.mts.config.MTSConfig;
import com.lowes.mts.service.TxrService;

public class App {

	public static void main(String[] args) {

		// Init
		ConfigurableApplicationContext context = null;
		context = new AnnotationConfigApplicationContext(MTSConfig.class);

		// Use
		TxrService txrService = context.getBean("txrService", TxrService.class);
		txrService.txr(300.00, "1", "2");

		// Destroy
		context.close();

	}

}
