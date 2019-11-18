package com.hrious.boot.app;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.MultipartConfigElement;

public class MyApplication {

    public static void run(Class... configClass) {
        // 手动创建tomcat
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8888);
        tomcat.addWebapp("/", "D:\\webapp");
        // 非Web应用方式启动
        // tomcat.addContext("/", null);

        // 初始化Spring环境
		// AnnotationConfigWebApplicationContext applicationContext =
                new AnnotationConfigWebApplicationContext();
		// applicationContext.register(configClass);

        // 初始化DispatcherServlet
		// DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
		// Wrapper wrapper = tomcat.addServlet("/", "dispatcherServlet", dispatcherServlet);
        // 配置DispatcherServlet
		// wrapper.setLoadOnStartup(1);
		// wrapper.addMapping("/");
        // 使用Servlet3.0进行上传，需要在DispatcherServlet中设置上传的相关配置
		// 如果不指定的话则使用默认的工作目录
		// wrapper.setMultipartConfigElement(new MultipartConfigElement("/tmp"));

        try {
        	// 启动tomcat
            tomcat.start();
            tomcat.getServer().await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }

}
