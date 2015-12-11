package sarin.app.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class ControllerView {

	/*function for load home page*/
	@RequestMapping(value={"/","/index"}, method = RequestMethod.GET)
	public ModelAndView list() throws SQLException{			
		ModelAndView model=new ModelAndView("index");
		System.out.println(123);
		return model;
	}
	
	/*function for respone data to view*/
	
	@RequestMapping(method = RequestMethod.GET, value = "/help")
	public ModelAndView help() {			
		ModelAndView model=new ModelAndView("help");
		//System.out.println(123);
		return model;
	}
	
}
