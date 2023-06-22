package com.SpringRest.RestWithBoot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.RestWithBoot.Entities.Course;
import com.SpringRest.RestWithBoot.services.HomeService;

@RestController
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@GetMapping("/GetData")
	public List<Course> getRequest() {
		return this.homeService.getData();
	}
	
	
	@PostMapping("/InsertData")
	public Course postData(@RequestBody Course course) {
		return this.homeService.putData(course);
	}
	
	
	@PutMapping("/updateData")
	public void updateData() {
		
	}
	
	@DeleteMapping("/deleteData")
	public void deleteData() {
		
	}

}
