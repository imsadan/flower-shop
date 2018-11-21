package csc.hfz.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import csc.hfz.common.CartItem;
import csc.hfz.pojo.FlowerList;
import csc.hfz.service.cartService;

@Controller
public class cartController {
     
	@Autowired
	private cartService cartService;
	
	//得到花种的详细信息
	@RequestMapping("/productdetail/{id}")
	public String getProducts(@PathVariable Integer id,Model model){
		FlowerList flowerList=cartService.seeFlowerById(id);
		List<FlowerList> list=new ArrayList<>();
		list.add(flowerList);
		model.addAttribute("productList",list);
		return "productdetail";
	}
	
	
	//获取购物车
	@RequestMapping("/shopCart/{flowerid}")
	public String getCart(@PathVariable Integer flowerid,
		@RequestParam(defaultValue="1")Integer num,HttpServletRequest request,HttpServletResponse response){
		//添加商品到购物车
		cartService.addFlowerCart(request, response, flowerid, num);
		return "cartSuccess";
		
	}
	
	//跳转购物车页面
	@RequestMapping("/cart/check")
	public String backCart(HttpServletRequest request,HttpServletResponse response,Model model,HttpSession session){
		//读取购物车
		List<CartItem> list=cartService.getCartItems(request, response);
		model.addAttribute("carts", list);
		session.setAttribute("Itemcart",list);
		return "shoppingcart";
		
	}
	
	//修改数量1
	@RequestMapping(value="/add/{flowerid}",method =RequestMethod.POST)
	public String ChangeCartNum(@PathVariable Integer flowerid,@RequestParam(defaultValue="1")Integer num, 
			HttpServletRequest request, HttpServletResponse response){
		cartService.addFlowerCart(request, response, flowerid, num);
		return "redirect:/cart/check";
		
	}
	
	//修改数量2
		@RequestMapping(value="/update/{flowerid}/{num}",method = RequestMethod.POST)
		public String ChangeCartNum2(@PathVariable Integer flowerid,@PathVariable Integer num, 
				HttpServletRequest request, HttpServletResponse response){
			cartService.changeCartItemNum(flowerid, num, request, response);
			return "redirect:/cart/check";
			
		}
	
	//删除
	@RequestMapping("/cart/delete/{flowerid}")
	public String deleteCartItem(@PathVariable Integer flowerid, HttpServletRequest request, HttpServletResponse response) {
		cartService.deleteCartItem(flowerid, request, response);
		return "redirect:/cart/check";
	}
	
}
