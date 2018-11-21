package csc.hfz.common;

import java.util.List;

import csc.hfz.pojo.OrderList;
import csc.hfz.pojo.OrderitemsList;

public class Order extends OrderList{
    private List<OrderitemsList> orderitemsLists;

	public List<OrderitemsList> getOrderitemsLists() {
		return orderitemsLists;
	}

	public void setOrderitemsLists(List<OrderitemsList> orderitemsLists) {
		this.orderitemsLists = orderitemsLists;
	}
    
    
    
}
