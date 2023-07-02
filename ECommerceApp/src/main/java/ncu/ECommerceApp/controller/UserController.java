package ncu.ECommerceApp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ncu.ECommerceApp.dao.UserDAO;
import ncu.ECommerceApp.entity.User;

@Controller
public class UserController {
	
	@Autowired
	UserDAO uDAO;
	
	@ModelAttribute("user")
	public User getUser() {
		return new User();
	}
	
	@RequestMapping(value="/register")
	public String getRegistrationForm() {
		return "register";
	}
	
	@RequestMapping(value="/redirect")
	public String getRedirect(@Valid @ModelAttribute("user") User user, BindingResult br) {
		if(br.hasErrors()) {
			return "register";
		}
		else {
			uDAO.insertUser(user);
			return "display";
		}
		
	}
}
