package com.hrious.ioc.app;

import com.hrious.ioc.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext();
		applicationContext.register(AppConfig.class);
		applicationContext.refresh();
	}
}
