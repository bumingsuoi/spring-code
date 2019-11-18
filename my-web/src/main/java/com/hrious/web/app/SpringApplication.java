package com.hrious.web.app;

import com.hrious.web.config.AppConfig;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringApplication {

	public static void run() {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);

		// tomcat会以运行Web项目的方式启动
		// tomcat.addWebapp("/", "D:\\gc\\");

		// Tomcat将不会以web应用的方式启动
		// jsp不会报错
		// 需要手动将DispatcherServlet实例化
		tomcat.addContext("/", null);

		// Load Spring web application configuration
		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
		ac.register(AppConfig.class);

		// Create and register the DispatcherServlet
		DispatcherServlet servlet = new DispatcherServlet(ac);
		Wrapper wrapper = tomcat.addServlet("/", "dispatcherServlet", servlet);
		wrapper.addMapping("*.do");
		wrapper.setLoadOnStartup(1);

		try {
			tomcat.start();
			tomcat.getServer().await();
		} catch (LifecycleException e) {

		}
	}
}
