package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;

@RestController
public class UserController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/queryUsers")
	public List<User> queryUsers(){
		String sql = "select * from user";
		return (List)jdbcTemplate.query(sql, new RowMapper() {
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword("password");
				return user;	
			}
		});
	}

}
