package csc.hfz.mapper;

import csc.hfz.pojo.AdvList;
import csc.hfz.pojo.AdvListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdvListMapper {
    int countByExample(AdvListExample example);

    int deleteByExample(AdvListExample example);

    int deleteByPrimaryKey(Long advid);

    int insert(AdvList record);

    int insertSelective(AdvList record);

    List<AdvList> selectByExample(AdvListExample example);

    AdvList selectByPrimaryKey(Long advid);

    int updateByExampleSelective(@Param("record") AdvList record, @Param("example") AdvListExample example);

    int updateByExample(@Param("record") AdvList record, @Param("example") AdvListExample example);

    int updateByPrimaryKeySelective(AdvList record);

    int updateByPrimaryKey(AdvList record);
}