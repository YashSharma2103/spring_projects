package ncu.student.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ncu.student.entity.student;
import ncu.student.studentrowMapper.studentrowMapper;

@Repository
public class studentDaoimp implements studentDAO  {
	
	private JdbcTemplate jdbcTemplate;
/*
	@Override
	public List<student> loadstudents() {
		List<student> studentlist = new ArrayList<student>();
		String sql="select *from details";
		jdbcTemplate.query(sql,new studentrowMapper());
		return studentlist;
	}
*/
	@Override
	public int insert(student student){
		
		String query=" insert into details values(?,?,?,?,?,?,?)";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getPassword(),student.getConf_pass(),student.getMail(),student.getGender(),student.getCourses(),student.getTutor());
		
		return r;
		
	}
	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
