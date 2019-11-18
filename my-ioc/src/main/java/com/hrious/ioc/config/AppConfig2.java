package com.hrious.ioc.config;

import com.hrious.ioc.dao.IndexDao;
import com.hrious.ioc.service.IndexService;
import com.hrious.ioc.service.impl.IndexServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {

	private IndexDao indexDao;

	@Autowired
	public void setIndexDao(IndexDao indexDao) {
		this.indexDao = indexDao;
	}

	@Bean
	public IndexService indexService() {
		return new IndexServiceImpl();
	}
}
