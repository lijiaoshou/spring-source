package com.yonyoucloud.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {
	public void query() {
		System.out.println("查询");
	}
}
