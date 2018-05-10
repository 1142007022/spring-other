package com.kaishengit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insert(String mobile,String password,String status,String accName) {
		String sql = "insert into account (mobile,password,status,acc_Name) values(?,?,?,?)";
		jdbcTemplate.update(sql, mobile,password,status,accName);
	}
	
}
