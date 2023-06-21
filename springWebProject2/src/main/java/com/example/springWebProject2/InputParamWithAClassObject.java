package com.example.springWebProject2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class InputParamWithAClassObject {
	
	//use below URL access below method
	//http://localhost:8081/secondhome?aname=chandra&aid=1&tech=java
	
	@RequestMapping("secondhome")
	public ModelAndView secondHome(Inputobject inputobject) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",inputobject);
		mv.setViewName("secondhome.jsp");
		
		return mv;
	}

}
