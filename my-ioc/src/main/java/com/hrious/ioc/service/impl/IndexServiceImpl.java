package com.hrious.ioc.service.impl;

import com.hrious.ioc.dao.IndexDao;
import com.hrious.ioc.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Service
public class IndexServiceImpl implements IndexService {

	@Autowired
	private IndexDao indexDao;

	public IndexServiceImpl() {
		System.out.println("无参构造方法....");
	}

	@Transactional
	@Override
	public void get() {
		indexDao.query();
		System.out.println("get...");
	}
}
