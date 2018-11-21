package csc.hfz.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import csc.hfz.common.Order;
import csc.hfz.common.TaotaoResult;
import csc.hfz.mapper.OrderListMapper;
import csc.hfz.mapper.OrderitemsListMapper;
import csc.hfz.mapper.UserListMapper;
import csc.hfz.pojo.OrderList;
import csc.hfz.pojo.OrderListExample;
import csc.hfz.pojo.OrderListExample.Criteria;
import csc.hfz.pojo.OrderitemsList;
import csc.hfz.pojo.OrderitemsListExample;
import csc.hfz.pojo.UserList;


@Service
public class orderServiceImpl implements orderService {
    
	@Autowired
	private OrderListMapper orderListMapper;
	@Autowired
	private OrderitemsListMapper orderitemsListMapper;
	@Autowired
	private UserListMapper userListMapper;
	
	@Override
	public TaotaoResult createOrder(Order order,
			List<OrderitemsList> orderitemsLists) {
		//随机创建orderId
		int orderid=(int) (Math.random()*99999);
		order.setOrderid(orderid);
		//补全订单
		order.setCreated(new Date());
		order.setUpdated(new Date());
		//添加至数据库
		orderListMapper.insert(order);
		//整一个订单的总价,数量

		for (OrderitemsList list:orderitemsLists) {
			int itemid=(int) (Math.random()*99999);
			list.setItemid(itemid);
			list.setOrderid(orderid);
			//添加详细至数据库
			orderitemsListMapper.insert(list);
			
		}
		
		return TaotaoResult.ok();
	}

	@Override
	public List<OrderitemsList> selectMyOrder(int id) {
		List<OrderitemsList> items=new ArrayList<>();
		UserList user=userListMapper.selectByPrimaryKey(id);
		String username=user.getUsername();
		//查询总订单
		OrderListExample example=new OrderListExample();
		Criteria criteria=example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<OrderList> orderLists=orderListMapper.selectByExample(example);
			for (OrderList order:orderLists) {
				int orderId=order.getOrderid();
				OrderitemsListExample example2=new OrderitemsListExample();
				csc.hfz.pojo.OrderitemsListExample.Criteria criteria2=example2.createCriteria();
				criteria2.andOrderidEqualTo(orderId);
				List<OrderitemsList> list=orderitemsListMapper.selectByExample(example2);
				//获取itemid号查询
				for (OrderitemsList oList:list) {
					int itemId=oList.getItemid();
					//获取商品信息
					OrderitemsList orderitems=orderitemsListMapper.selectByPrimaryKey(itemId);
					items.add(orderitems);
				}
				return items;
				//查询订单商品详细
				/*OrderitemsList orderitems=orderitemsListMapper.selectByPrimaryKey2(orderId);*/
			}
			return items;
		
	}



}
