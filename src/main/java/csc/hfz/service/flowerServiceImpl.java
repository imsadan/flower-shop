package csc.hfz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import csc.hfz.common.flowerMap;
import csc.hfz.mapper.AdvListMapper;
import csc.hfz.mapper.FlowerListMapper;
import csc.hfz.pojo.AdvList;
import csc.hfz.pojo.AdvListExample;
import csc.hfz.pojo.FlowerList;
import csc.hfz.pojo.FlowerListExample;

@Service
public class flowerServiceImpl implements flowerService {
	
    flowerMap flowerMap=new flowerMap();
	
	@Autowired
	private FlowerListMapper flowerListMapper;
	
	@Autowired
	private AdvListMapper advListMapper;
	
	@Override
	public List<FlowerList> select(FlowerList flowerList) {
		FlowerListExample example=new FlowerListExample();
		List<FlowerList> list=flowerListMapper.selectByExample(example);
        return list;
	}

	@Override
	public List<AdvList> selectAdvs(AdvList advList) {
		AdvListExample example=new AdvListExample();
		List<AdvList> list=advListMapper.selectByExample(example);
		return list;
	}


}
