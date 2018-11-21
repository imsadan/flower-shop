package csc.hfz.service;

import java.util.List;
import csc.hfz.common.Order;
import csc.hfz.common.TaotaoResult;
import csc.hfz.pojo.OrderitemsList;

public interface orderService {
    //创建只含商品的订单
	TaotaoResult createOrder(Order order,List<OrderitemsList> orderitemsLists);
    //个人订单查询
	List<OrderitemsList> selectMyOrder(int id);
 }
