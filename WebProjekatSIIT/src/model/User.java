package model;

import java.util.Date;

public class User {
	private String password;
	private String name;
	private String surname;
	private Date date;
	private Role role;
	private BuyerType buyerType;
	private String username;
	
	
	
	
	public User() {
		
		super();
		
	}
	
	
	public User(String password, String name, String surname, Date date, Role role, BuyerType buyerType,
			String username) {
		super();
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.date = date;
		this.role = role;
		this.buyerType = buyerType;
		this.username = username;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	


}
