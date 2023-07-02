package ncu.student.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import ncu.student.DAO.studentDAO;
import ncu.student.config.jdbcConnection;

public class app {
	ApplicationContext context=new AnnotationConfigApplicationContext(jdbcConnection.class);
	//JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
	
	studentDAO studentDao=context.getBean("studentDao",studentDAO.class);
	
	student student1=new student();
	
	student1.setName("Yash");
	student1.setPassword("1765");
	student1.setConf_pass("1765");
	student1.setMail("yash@gmail.com");
	student1.setGender("M");
	student1.setCourses("C");
	student1.setTutor("Anu Tonk");
	
	int result=studentDao.insert(student1);
	System.out.println("student added");


}
