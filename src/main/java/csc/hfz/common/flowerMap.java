package csc.hfz.common;

import java.util.HashMap;
import java.util.Map;

import csc.hfz.pojo.FlowerList;

/**
 * @author hfzhang
 * @category jsp前台需要遍历的map属性
 * 
 */
public class flowerMap {

	Map<Integer, FlowerList> flowerMap=new HashMap<Integer, FlowerList>();

	public Map<Integer, FlowerList> getFlowerMap() {
		return flowerMap;
	}

	public void setFlowerMap(Map<Integer, FlowerList> flowerMap) {
		this.flowerMap = flowerMap;
	}
	
	

}
