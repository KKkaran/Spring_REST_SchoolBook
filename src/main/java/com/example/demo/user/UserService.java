package com.example.demo.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.location.Location;

@Service
public class UserService{

	User u1 = new User("u1","Karan","Sodhi",new Location("2","12 Trailridge Dr."),"karan@gmail.com");
	User u2 = new User("u2","Bob","Saini",new Location("11","20 Tina Crt."),"bob@gmail.com");
	
	List<User> users = Arrays.asList(u1,u2);

	
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return users;
	}
}
