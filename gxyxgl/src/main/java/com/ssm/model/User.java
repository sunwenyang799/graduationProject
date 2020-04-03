package com.ssm.model;

import java.util.Date;

public class User {

	// id
	private String id;
	// 用户名
	private String username;
	// 密码
	private String password;
	// 角色
	private Integer role;
	// 登录时间
	private Date logintime;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String id, String username, String password, Integer role, Date logintime) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.logintime = logintime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public Date getLogintime() {
		return logintime;
	}

	public void setLogintime(Date logintime) {
		this.logintime = logintime;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", logintime=" + logintime + "]";
	}
	
}
