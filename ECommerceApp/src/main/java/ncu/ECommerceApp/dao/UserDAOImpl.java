package ncu.ECommerceApp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import ncu.ECommerceApp.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public void insertUser(User user) {
		String sql = "INSERT into user values (?,?,?,?,?,?);";
		jdbc.update(sql, user.getFname(), user.getLname(), user.getUser(), user.getPassword(), user.getEmail(), user.getType());
	}

	@Override
	public User fetchUser(String uname) {
		String sql = "SELECT * FROM user WHERE user='" + uname + "';";
		return jdbc.query(sql, new ResultSetExtractor<User>() {

			@Override
			public User extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					User user = new User();
					user.setFname(rs.getString("fname"));
					user.setLname(rs.getString("lname"));
					user.setUser(rs.getString("user"));
					user.setPassword(rs.getString("password"));
					user.setEmail(rs.getString("email"));
					user.setType(rs.getString("type"));
					
					return user;
				}
				return null;
			}
			
		});
	}

}
