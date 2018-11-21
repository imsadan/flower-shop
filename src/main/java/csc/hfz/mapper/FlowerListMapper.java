package csc.hfz.mapper;

import csc.hfz.pojo.FlowerList;
import csc.hfz.pojo.FlowerListExample;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface FlowerListMapper {
    int countByExample(FlowerListExample example);

    int deleteByExample(FlowerListExample example);

    int deleteByPrimaryKey(Integer flowerid);

    int insert(FlowerList record);

    int insertSelective(FlowerList record);

    List<FlowerList> selectByExample(FlowerListExample example);

    FlowerList selectByPrimaryKey(Integer flowerid);

    int updateByExampleSelective(@Param("record") FlowerList record, @Param("example") FlowerListExample example);

    int updateByExample(@Param("record") FlowerList record, @Param("example") FlowerListExample example);

    int updateByPrimaryKeySelective(FlowerList record);

    int updateByPrimaryKey(FlowerList record);
    
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