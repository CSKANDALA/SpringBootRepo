package com.SpringRest.RestWithBoot.Entities;

public class Course {
	
	public int id;
	public String name;
	public String techonlogy;
	
	
	public Course(int id, String name, String techonlogy) {
		super();
		this.id = id;
		this.name = name;
		this.techonlogy = techonlogy;
	}


	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTechonlogy() {
		return techonlogy;
	}


	public void setTechonlogy(String techonlogy) {
		this.techonlogy = techonlogy;
	}
	
	
	
	

}
