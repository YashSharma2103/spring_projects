package ncu.ECommerceApp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	@NotNull(message="field can't be empty")
	private String fname;
	
	@NotNull(message="field can't be empty")
	private String lname;
	
	@NotNull(message="field can't be empty")
	private String user;
	
	@NotNull(message="field can't be empty")
	@Size(min=4, message="Minimum limit is 4 characters")
	private String password;
	
	@NotNull(message="field can't be empty")
	private String email;
	
	private String type;
	private List<String> typeOptions;
	
	public User() {
		typeOptions = new ArrayList<>();
		typeOptions.add("customer");
		typeOptions.add("seller");		
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<String> getTypeOptions() {
		return typeOptions;
	}
	public void setTypeOptions(List<String> typeOptions) {
		this.typeOptions = typeOptions;
	}
	
	
}
