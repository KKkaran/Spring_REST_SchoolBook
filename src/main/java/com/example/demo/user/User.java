package com.example.demo.user;

import com.example.demo.location.Location;

public class User {
	
	private String id;
	private String fname;
	private String lname;
	private Location location;
	private String email;
	
	public User(String id, String fname, String lname, Location location, String email) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.location = location;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
