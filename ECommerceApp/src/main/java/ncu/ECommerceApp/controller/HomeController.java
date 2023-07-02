package ncu.ECommerceApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ncu.ECommerceApp.dao.UserDAO;
import ncu.ECommerceApp.entity.Login;
import ncu.ECommerceApp.entity.User;

@Controller
public class HomeController {
	
	@Autowired
	UserDAO uDAO;

	@ModelAttribute("login")
	public Login getLogin() {
		return new Login();
	}
	
	@RequestMapping(value="/")
	public String getHome(){
		return "home";
	}
	
	@RequestMapping(value="/seller")
	public String getLogin(@ModelAttribute("login") Login login)
	{
		User u=uDAO.fetchUser(login.getUser());
		if(u!=null)
		{
			if(login.getPassword().equals(u.getPassword())) {
				return "redirect";
			}
			else {
				return "home";
			}
		}
		else {
			return "home";
		}
		
	}
}
