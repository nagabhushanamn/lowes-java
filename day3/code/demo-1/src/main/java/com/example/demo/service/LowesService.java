package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.config.MyConfig;

@PropertySource(value = "db.properties")
@Service
public class LowesService {

	@Autowired
	private MyConfig myConfig;

	@Autowired
	private Environment environment;

	public void doService() {
		System.out.println(myConfig.isFeatureEnabled());
		System.out.println(myConfig.getCompName());
		// System.out.println(environment.getProperty("db.url"));
	}

}
