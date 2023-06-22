package com.SpringRest.RestWithBoot.services;

import java.util.List;

import com.SpringRest.RestWithBoot.Entities.Course;

public interface HomeService {
	
	public List<Course> getData();
	
	public Course putData(Course course);
	
	

}
