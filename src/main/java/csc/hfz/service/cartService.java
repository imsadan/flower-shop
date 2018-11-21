package csc.hfz.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import csc.hfz.common.CartItem;
import csc.hfz.common.TaotaoResult;
import csc.hfz.pojo.FlowerList;

public interface cartService {
   //根据id查看花种详细
	FlowerList seeFlowerById(int flowerid);
	//添加到购物车
	TaotaoResult addFlowerCart(HttpServletRequest request,
			HttpServletResponse response,
			int id,int number);
	//获取购物车
	public List<CartItem> getCartItems(HttpServletRequest request,HttpServletResponse response);
    
	//修改数量
	TaotaoResult changeCartItemNum(int itemId,int num,
			HttpServletRequest request,HttpServletResponse response);
	//删除商品
	TaotaoResult deleteCartItem(int itemId, HttpServletRequest request, HttpServletResponse response);
	
}
