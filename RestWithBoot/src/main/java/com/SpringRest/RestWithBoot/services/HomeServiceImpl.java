package com.SpringRest.RestWithBoot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringRest.RestWithBoot.Entities.Course;

@Service
public class HomeServiceImpl implements HomeService {

	List<Course> list;
	
	public HomeServiceImpl() {
		list= new ArrayList<>();
		list.add(new Course(1, "chandra", "java") );
		list.add(new Course(2, "sekhar", "react") );
	}
	
	@Override
	public List<Course> getData() {
		return list;
	}

	@Override
	public Course putData(Course course) {
		 list.add(course);
		 return course;
	}

}
