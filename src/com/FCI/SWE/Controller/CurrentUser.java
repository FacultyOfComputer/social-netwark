package com.FCI.SWE.Controller;
/*
 * cuurent user class take name, email ,password
 * and we will use it to make function sign out
 * contains setter and getter and constructor 
 */
public class CurrentUser {
	public String name;
	public String password;

	public static CurrentUser user = null;
	
	public CurrentUser(String name,String password) {
		this.name=name;
		this.password=password;

}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static CurrentUser getUser() {
		return user;
	}
	public static void setUser(CurrentUser user) {
		CurrentUser.user = user;
	}
	
	
	
	
}