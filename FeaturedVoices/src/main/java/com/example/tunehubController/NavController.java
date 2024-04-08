package com.example.tunehubController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {

	@GetMapping("/amy-sch")
	public String amySchneider() {
		return "amySchneiderJ";
		
	}
	@GetMapping("/writ-with")
	public String writingdocumentary() {
		return "writingwith";
		
	}
	@GetMapping("/ana-mod")
	public String anatolLiieven() {
		return "moderna";
		
	}
	@GetMapping("/pres-sure")
	public String pressureMounts() {
		return "pressure";
		
	}
	@GetMapping("/jam-webb")
	public String theJames() {
		return "jamesWebb";
		
	}
	@GetMapping("/we-urg")
	public String weUrgentlyNeed() {
		return "weUrgently";
		
	}
}
