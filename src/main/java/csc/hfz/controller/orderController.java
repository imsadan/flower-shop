package csc.hfz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import csc.hfz.common.Order;
import csc.hfz.pojo.OrderitemsList;
import csc.hfz.service.orderService;

@Controller
public class orderController {
    @Autowired
    private orderService orderService;
    
    @RequestMapping("/order/create")
    public String createOrder( Order order){
    	List<OrderitemsList> orderitemsLists=order.getOrderitemsLists();
    	orderService.createOrder(order,orderitemsLists );
    	return "redirect:/success";
    	
    }
    
    @RequestMapping(value="/checkout/{uid}")
    public String MyOrder(@PathVariable Integer uid,Model model){
    	List<OrderitemsList> list=orderService.selectMyOrder(uid);
    	model.addAttribute("itemOrder", list);
    	return "Myorder";
    }
}
