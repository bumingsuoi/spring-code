package com.hrious.ioc.app;

import com.hrious.ioc.aspect.LogAspect;
import com.hrious.ioc.config.AppConfig;
import com.hrious.ioc.dao.IndexDao;
import com.hrious.ioc.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext();
		applicationContext.register(AppConfig.class);
		applicationContext.refresh();

//		IndexDao indexDao = applicationContext.getBean(IndexDao.class);
//		indexDao.query();
//
//		LogAspect logAspect = applicationContext.getBean(LogAspect.class);
//		System.out.println(logAspect);

//		DataSource dataSource = applicationContext.getBean(DataSource.class);
//		System.out.println(dataSource);

		IndexService indexService = applicationContext.getBean(IndexService.class);
		indexService.get();
	}
}
