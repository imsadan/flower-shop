package csc.hfz.test;

import java.util.ArrayList;
import java.util.List;

public class test01 {
	
    public static void main(String[] args) {
    	List<order> list=new ArrayList<>();
    	List<order> list2=new ArrayList<>();
		list.add(new order(1,"hfz"));
		list.add(new order(2, "imsadan"));
		list.add(new order(3, "putty"));
		for (order order:list) {
			int id=order.getId();
			list2.add(new order(id));
		}
		System.out.println(list2);
	}
}
