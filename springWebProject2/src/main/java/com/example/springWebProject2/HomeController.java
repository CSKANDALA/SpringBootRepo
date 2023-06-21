
  package com.example.springWebProject2;
  
  import org.springframework.stereotype.Controller; 
  import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest; 
  
  @Controller 
  public class HomeController {

	  //use below URL to access application after starting
	  //localhost:8081/home?name=chandra

	  @RequestMapping("home")
	  public String home(HttpServletRequest req) {
		  
		  String name = req.getParameter("name");
		  System.out.println("passed data : " + name);
		  System.out.println("home method in controller called"); 
		  return "home.jsp";
	  } 
  }
 