package com.recipe.common;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = { "classpath:application.properties" }, ignoreResourceNotFound = false)	
public class ApplicationProperties implements EnvironmentAware {
	
	private static Environment environment;

	@Override
	public void setEnvironment(Environment environment) {
		ApplicationProperties.environment=environment;
	}
	
	public static String getProperty(String key) {
		return environment.getProperty(key);
	}

}
