package csc.hfz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import csc.hfz.service.flowerPageService;

@Controller
public class flowerPageController {
   
	@Autowired
	private flowerPageService flowerPageService;
	
	@RequestMapping("/page/products")
	public String flowerPages(@RequestParam(value="currentPage",defaultValue="1",required=false)int currentPage
			,Model model){
		model.addAttribute("pagemsg", flowerPageService.findByPage(currentPage));
		return "products";
	}
 
}
