package com.spring;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAOImpl implements StudentDAO {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insertStudent(int id, String name, int age) {
		// TODO Auto-generated method stub
		String SQL="insert into Student values(?,?,?)";
		jdbcTemplate.update(SQL,id,name,age);
		System.out.println("Student inserted.");
	}

	public void updateStudent(int id, int age) {
		// TODO Auto-generated method stub
		String SQL="update Student set age=? where id=?";
		jdbcTemplate.update(SQL,age,id);
		System.out.println("Student updated.");
	}

	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		String SQL="delete from Student where id=?";
		jdbcTemplate.update(SQL,id);
		System.out.println("Student deleted.");
	}

	public List<Map<String, Object>> listStudents() {
		// TODO Auto-generated method stub
		String SQL ="Select * from Student";
		return jdbcTemplate.queryForList(SQL);
	}
	
}
