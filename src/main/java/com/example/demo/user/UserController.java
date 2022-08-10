package com.example.demo.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.location.Location;

@RestController
public class UserController {
	
	@RequestMapping(value = "/users")
	public List<User> getAllUsers(){
		
		User u1 = new User("u1","Karan","Sodhi",new Location("2","12 Trailridge Dr."),"karan@gmail.com");
		User u2 = new User("u2","Bob","Saini",new Location("11","20 Tina Crt."),"bob@gmail.com");
		
		return Arrays.asList(u1,u2);

		
	}

}
