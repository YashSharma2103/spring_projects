package ncu.student.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import ncu.student.DAO.studentDAO;
import ncu.student.DAO.studentDaoimp;

@Configuration
public class jdbcConnection {
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/student");
		ds.setUsername("root");
		ds.setPassword("Yash@2103");
		return ds;
		
	}
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();  
		jdbcTemplate.getDataSource();
		return jdbcTemplate;
	}
	@Bean("studentDao")
	public studentDAO getStudentDao() {
		studentDaoimp studentDao=new studentDaoimp();
		studentDao.setJdbcTemplate(getTemplate()); 
		return studentDao;
	}
}
