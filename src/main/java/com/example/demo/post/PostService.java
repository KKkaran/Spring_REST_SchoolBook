package com.example.demo.post;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.location.Location;
import com.example.demo.user.User;

@Service
public class PostService {
	
		User user1 = new User(
			"u1", 
			"Jany", 
			"Lawrence",
			new Location("l1", "Lagos"),
			"SYL@gmail.com");
			
		User user2 = new User(
			"u2", 
			"Jadon", 
			"Mills",
			new Location("l2", "Asaba"),
			"Jadon@gmail.com");
			
		Post post1 = new Post(
			"p1",
			"01-Jan-19",
			user1,
		        "Its good to love and be loved");
			
		Post post2 = new Post(
			"p2",
		        "02-Jan-19",
			user2,
			"We all need someone");	

		public List<Post> getAllPosts(){
			return Arrays.asList(post1,post2);
		}	
}
