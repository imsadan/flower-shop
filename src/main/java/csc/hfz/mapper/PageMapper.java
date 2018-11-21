package csc.hfz.mapper;

import java.util.HashMap;
import java.util.List;
import csc.hfz.pojo.FlowerList;

public interface PageMapper {

	/**
     * 查询用户记录总数
     * @return
     */
    int selectCount();
    /**
     * 分页操作，调用findByPage limit分页方法
     * @param map
     * @return
     */
    List<FlowerList> findByPage(HashMap<String,Object> map);
}
