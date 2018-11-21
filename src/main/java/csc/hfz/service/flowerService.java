package csc.hfz.service;

import java.util.List;

import csc.hfz.pojo.AdvList;
import csc.hfz.pojo.FlowerList;

public interface flowerService {
    
	//查詢所有花種
	List< FlowerList> select(FlowerList flowerList);
	//查询广告页面
	List<AdvList> selectAdvs(AdvList advList);
	
}
