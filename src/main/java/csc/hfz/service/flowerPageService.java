package csc.hfz.service;

import csc.hfz.common.Page;
import csc.hfz.pojo.FlowerList;


public interface flowerPageService {
	 //查询总数
	public int selectCount();
     //分页
	public Page<FlowerList> findByPage(int currentPage);
}
