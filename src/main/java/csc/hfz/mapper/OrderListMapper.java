package csc.hfz.mapper;

import csc.hfz.pojo.OrderList;
import csc.hfz.pojo.OrderListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderListMapper {
    int countByExample(OrderListExample example);

    int deleteByExample(OrderListExample example);

    int deleteByPrimaryKey(Integer orderid);

    int insert(OrderList record);

    int insertSelective(OrderList record);

    List<OrderList> selectByExample(OrderListExample example);

    OrderList selectByPrimaryKey(Integer orderid);

    int updateByExampleSelective(@Param("record") OrderList record, @Param("example") OrderListExample example);

    int updateByExample(@Param("record") OrderList record, @Param("example") OrderListExample example);

    int updateByPrimaryKeySelective(OrderList record);

    int updateByPrimaryKey(OrderList record);
}