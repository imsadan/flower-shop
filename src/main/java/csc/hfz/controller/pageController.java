package csc.hfz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
	
	// 页面跳转至注册页面
	@RequestMapping("page/userRegist")
	public String pageRegist() {
		return "register";
	}

	// about页面
	@RequestMapping("/about")
	public String aboutPage() {
		return "about";
	}

	// checkout页面
	@RequestMapping("/checkout")
	public String checkoutPage() {
		return "checkout";
	}

	// contact页面
	@RequestMapping("/contact")
	public String contactPage() {
		return "contact";
	}

	// 购物车页面
	@RequestMapping("/shoppingcart")
	public String shoppingcartPage() {
		return "shoppingcart";
	}

	// success页面
	@RequestMapping("/success")
	public String checkSuccess() {
		return "success";
	}

	// 花种页面
	@RequestMapping("/product")
	public String products() {
		return "products";
	}
}
