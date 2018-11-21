package csc.hfz.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import csc.hfz.common.CartItem;
import csc.hfz.common.CookieUtils;
import csc.hfz.common.JsonUtils;
import csc.hfz.common.TaotaoResult;
import csc.hfz.mapper.FlowerListMapper;
import csc.hfz.pojo.FlowerList;
@Service
public class cartServiceImpl implements cartService{
    
	@Autowired
	private FlowerListMapper flowerListMapper;
	
	@Override
	public FlowerList seeFlowerById(int flowerid) {
		FlowerList flowerList=flowerListMapper.selectByPrimaryKey(flowerid);
		return flowerList;
	}
  
	@Override
	public TaotaoResult addFlowerCart(HttpServletRequest request,
			HttpServletResponse response,
			int id, int number) {
		//取信息
		CartItem cartitem=null;
		List<CartItem> itemlist=getCartItemList(request);
		for(CartItem item:itemlist) {
			//存在
			if (item.getFlowerid()==id) {
				item.setNum(item.getNum()+number);
				cartitem=item;
				break;
			}
		}
		if (cartitem==null) {
			cartitem=new CartItem();
			FlowerList flowerList=flowerListMapper.selectByPrimaryKey(id);
			cartitem.setFlowerid(flowerList.getFlowerid());
			cartitem.setFlowername(flowerList.getFlowername());
			cartitem.setImage(flowerList.getImage());
			cartitem.setFlowerprice(flowerList.getFlowerprice());
			cartitem.setNum(number);
			
			itemlist.add(cartitem);
			
		}
		
		CookieUtils.setCookie(request, response, "flowerCart",
				JsonUtils.objectToJson(itemlist),true);
		
		return TaotaoResult.ok();
	}
	
	 //从cookie中取商品列表
	 
		private List<CartItem> getCartItemList(HttpServletRequest request) {
			// 从cookie中取商品列表
			String cartJson =CookieUtils.getCookieValue(request, "flowerCart",true);
			if (cartJson == null) {
				return new ArrayList<>();
			}
			// 把json转换成商品列表
			try {
				List<CartItem> list = JsonUtils
						.jsonToList(cartJson, CartItem.class);
				return list;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new ArrayList<>();
		}
	
	
	@Override
	public List<CartItem> getCartItems(HttpServletRequest request,HttpServletResponse response){
		List<CartItem> list=getCartItemList(request);
		return list;
	}

	@Override
	public TaotaoResult changeCartItemNum(int itemId, int num,
			HttpServletRequest request, HttpServletResponse response) {
		List<CartItem> list=getCartItemList(request);
		for (CartItem cartItem:list) {
			if (cartItem.getFlowerid()==itemId) {
				cartItem.setNum(num);	
				break;
			}
		}
		//写入cookie
		CookieUtils.setCookie(request, response, "flowerCart",
				JsonUtils.objectToJson(list),true);
		return TaotaoResult.ok();
	}

	@Override
	public TaotaoResult deleteCartItem(int itemId, HttpServletRequest request,
			HttpServletResponse response) {
		List<CartItem> list=getCartItemList(request);
		for (CartItem cartItem:list) {
			if (cartItem.getFlowerid()==itemId) {
				list.remove(cartItem);
				break;
			}
		}
		//写入cookie
		CookieUtils.setCookie(request, response, "flowerCart",
				JsonUtils.objectToJson(list),true);
		return TaotaoResult.ok();
	}

}
