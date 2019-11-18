package com.hrious.ioc.dao;

import org.springframework.stereotype.Repository;

@Repository
public class IndexDao {
	public void query() {
		System.out.println("com.hrious.ioclearn.dao.IndexDao.query");
	}
}
