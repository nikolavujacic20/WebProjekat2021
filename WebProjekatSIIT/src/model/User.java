package model;

import java.util.Date;

public class User {
	private String password;
	private String name;
	private String lastname;
	private Date birthday;
	private Role role;
	private BuyerType buyerType;
	private String username;
	
	
	
	
	public User() {
		
		super();
		
	}




	public User(String password, String name, String lastname, Date birthday, Role role, BuyerType buyerType,
			String username) {
		super();
		this.password = password;
		this.name = name;
		this.lastname = lastname;
		this.birthday = birthday;
		this.role = role;
		this.buyerType = buyerType;
		this.username = username;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getLastname() {
		return lastname;
	}




	public void setLastname(String lastname) {
		this.lastname = lastname;
	}




	public Date getDate() {
		return birthday;
	}




	public void setDate(Date brithday) {
		this.birthday = brithday;
	}




	public Role getRole() {
		return role;
	}




	public void setRole(Role role) {
		this.role = role;
	}




	public BuyerType getBuyerType() {
		return buyerType;
	}




	public void setBuyerType(BuyerType buyerType) {
		this.buyerType = buyerType;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}
	
	


}
