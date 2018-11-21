package csc.hfz.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import csc.hfz.pojo.AdvList;
import csc.hfz.pojo.FlowerList;
import csc.hfz.service.flowerService;


@Controller
public class flowerController {

	
	@Autowired
	private flowerService flowerService;
	
	@RequestMapping("/")
	public String getAllFlowers(FlowerList flowerList,Model model,AdvList advList,HttpSession session){
		List<FlowerList> list=flowerService.select(flowerList);
		List<AdvList> adv_list=flowerService.selectAdvs(advList);
		session.setAttribute("pageFlower", list);
		model.addAttribute("AdvList",adv_list);
		return "index";
	}
	
}
