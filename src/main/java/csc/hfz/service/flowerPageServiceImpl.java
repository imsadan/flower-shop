package csc.hfz.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import csc.hfz.common.Page;
import csc.hfz.mapper.FlowerListMapper;
import csc.hfz.pojo.FlowerList;

@Service
public class flowerPageServiceImpl implements flowerPageService{
    
	@Autowired
	private FlowerListMapper flowerListMapper;
	
	@Override
	public int selectCount() {
		
		return flowerListMapper.selectCount();
	}

	@Override
	public Page<FlowerList> findByPage(int currentPage) {
		HashMap<String, Object> map=new HashMap<String, Object>();
		Page<FlowerList> pages=new Page<FlowerList>();
		//当前页数
		pages.setCurrPage(currentPage);
		//显示数据
		int pageSize=4;
		pages.setPageSize(pageSize);
		//总的数量
		int totalCount=flowerListMapper.selectCount();
		pages.setTotalCount(totalCount);
		//总页数
		double tc=totalCount;
		Double number=Math.ceil(tc/pageSize);  //向上取整
		pages.setTotalPage(number.intValue());
		
		map.put("start", (currentPage-1)*pageSize);
		map.put("size", pages.getPageSize());
		
		//每页显示的数据
		List<FlowerList> lists = flowerListMapper.findByPage(map);
		pages.setLists(lists);
		return pages;
	}
	
	

}
