package com.hrious.ioc.service.impl;

import com.hrious.ioc.dao.IndexDao;
import com.hrious.ioc.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Service
public class IndexServiceImpl implements IndexService {

	private IndexDao indexDao;

	public IndexServiceImpl() {
		System.out.println("无参构造方法....");
	}

	@Autowired
	public IndexServiceImpl(IndexDao indexDao) {
		System.out.println("有参构造方法....");
	}

	@Override
	public void get() {
		indexDao.query();
		System.out.println("com.hrious.ioclearn.service.impl.IndexServiceImpl.get");
	}
}
