package csc.hfz.mapper;

import csc.hfz.pojo.OrderitemsList;
import csc.hfz.pojo.OrderitemsListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderitemsListMapper {
    int countByExample(OrderitemsListExample example);

    int deleteByExample(OrderitemsListExample example);

    int deleteByPrimaryKey(Integer itemid);

    int insert(OrderitemsList record);

    int insertSelective(OrderitemsList record);

    List<OrderitemsList> selectByExample(OrderitemsListExample example);

    OrderitemsList selectByPrimaryKey(Integer itemid);
    
    //按orderId来查询
    OrderitemsList selectByPrimaryKey2(Integer orderid);

    int updateByExampleSelective(@Param("record") OrderitemsList record, @Param("example") OrderitemsListExample example);

    int updateByExample(@Param("record") OrderitemsList record, @Param("example") OrderitemsListExample example);

    int updateByPrimaryKeySelective(OrderitemsList record);

    int updateByPrimaryKey(OrderitemsList record);
}