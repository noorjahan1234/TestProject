package com.example.tunehubController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.tunehubService.ServicesFeatured;

@Controller
public class ControllerFeatured {

	ServicesFeatured sf;

	public ControllerFeatured(ServicesFeatured sf) {
		super();
		this.sf=sf;
	}
	@PostMapping("/AmySchneider's")
	public String anatolLieven() {
		return "Russia Has Been Warning the West About Ukraine for Decades";
		
	}
	@PostMapping("writing-with-fire-india-documentary/")
	public String ismataAra() {
		return "How It Feels to Be a Muslim Woman Sold by India's Right Wing";
		
	}
	@PostMapping("/anatolLiieven")
	public String robertJDavis() {
		return "Why You Shouldn't Exercise to Lose Weight";
		
	}
	@PostMapping("/PressureMounts")
	public String yohancaDelgado() {
		return "The Life-Changing Practice That Will Help You Feel More Gratitude";
		
	}
	@PostMapping("/TheJames")
	public String WKamauBell() {
		return "There's So Much More To Say About Bill Cosby";
		
	}
	@PostMapping("/WeUrgentlyNeed")
	public String christinaBu() {
		return "What Norway Can Tech that the World About Switching to Electric Vehicles";
		
	}
}
