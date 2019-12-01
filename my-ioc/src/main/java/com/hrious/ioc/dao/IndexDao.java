package com.hrious.ioc.dao;

import org.springframework.stereotype.Repository;

@Repository
public class IndexDao {

	public void query() {
//		throw new RuntimeException("query error..");
		System.out.println("query...");
	}
}
