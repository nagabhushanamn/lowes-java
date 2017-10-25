package com.example.demo.config;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component
@ConfigurationProperties(prefix = "my")
public class MyConfig {

	private boolean featureEnabled;
	
	@NotNull
	private String compName;

	public boolean isFeatureEnabled() {
		return featureEnabled;
	}

	public void setFeatureEnabled(boolean featureEnabled) {
		this.featureEnabled = featureEnabled;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

}
