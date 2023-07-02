package ncu.student.studentrowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ncu.student.entity.student;

public class studentrowMapper implements RowMapper<student> {

	@Override
	public student mapRow(ResultSet rs, int rowNum) throws SQLException {
		student student=new student();
		return null;
	}

}