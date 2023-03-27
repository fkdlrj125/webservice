package test.variable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VariableController {
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("var","Hello");
		return "index";
	}
	
}
