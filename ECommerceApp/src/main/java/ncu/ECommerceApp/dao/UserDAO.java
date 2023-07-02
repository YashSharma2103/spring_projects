package ncu.ECommerceApp.dao;

import ncu.ECommerceApp.entity.User;

public interface UserDAO {
	public void insertUser(User user);
	public User fetchUser(String uname);
}
