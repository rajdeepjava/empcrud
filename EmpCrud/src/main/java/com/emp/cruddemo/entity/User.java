package com.emp.cruddemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
private Long userid;
private String username;
private String city;
private int mobile;
public Long getUserid() {
	return userid;
}
public void setUserid(Long userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getMobile() {
	return mobile;
}
public void setMobile(int mobile) {
	this.mobile = mobile;
}
public User(Long userid, String username, String city, int mobile) {
	super();
	this.userid = userid;
	this.username = username;
	this.city = city;
	this.mobile = mobile;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [userid=" + userid + ", username=" + username + ", city=" + city + ", mobile=" + mobile + "]";
}

}
