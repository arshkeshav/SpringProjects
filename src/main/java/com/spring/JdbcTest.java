package com.spring;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTest {
	ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
	StudentDAO dao = (StudentDAO) context.getBean("student");
	dao.insertStudent(111,"Arsh",18);
	
	can you check my code if its possible? im facing an error.
	
}
