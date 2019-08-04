package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.service.IService;





@Controller
public class IndexController {
	
	
	private IService serviceOne; 
	
	
	
	
	@Autowired
	public IndexController(@Qualifier("serviceOne") IService serviceOne) {
		this.serviceOne = serviceOne;
	}

	@GetMapping ({"/","", "/index"})
	public String index(Model model) {
		model.addAttribute("objeto",serviceOne.operacion());
		return "index";
	}

	

}
