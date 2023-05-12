package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // This means that this class is a Controller
public class MainController {
	
	
	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping(path="/")
	public String getAllDeps (Model model) {
		model.addAttribute("ListClients" , clientRepository.findAll());
		return "index";
	}
	
}