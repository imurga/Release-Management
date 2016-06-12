package com.rm.dao.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

	@Id
	private Long userId;

	private String userName;

	private String password;

	private String email;

	private String possition;

	public User() {

		System.out.println("CAlling default cons");
	}

	@PersistenceConstructor
	public User(long userId, String userName, String password, String email,
			String possition) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.possition = possition;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getPossition() {
		return possition;
	}

	public void setPossition(String possition) {
		this.possition = possition;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password
				+ ", email=" + email + ", possition=" + possition + "]";
	}
}
