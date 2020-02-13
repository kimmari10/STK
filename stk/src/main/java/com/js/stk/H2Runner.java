package com.js.stk;

import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class H2Runner implements ApplicationRunner{

	@Autowired
	DataSource datasource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		try(Connection conn = datasource.getConnection()) {
			System.out.println(conn.getMetaData().getURL());
			System.out.println(conn.getMetaData().getUserName());
			
			Statement stmt = conn.createStatement();
			String sql = "CREATE TABLE USER (ID INTEGER NOT NULL, name VARCHAR(255), PRIMARY KEY (id))";
			stmt.executeUpdate(sql);
		}
		
		jdbcTemplate.execute("INSERT INTO USER VALUES (1, 'js')");
	}
}
