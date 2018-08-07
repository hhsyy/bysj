package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.Sc;
import org.itjl.model.ScCriteria;

public interface ScMapper {
    int countByExample(ScCriteria example);

    int deleteByExample(ScCriteria example);

    int deleteByPrimaryKey(Integer sc_id);

    int insert(Sc record);

    int insertSelective(Sc record);

    List<Sc> selectByExample(ScCriteria example);

    Sc selectByPrimaryKey(Integer sc_id);

    int updateByExampleSelective(@Param("record") Sc record, @Param("example") ScCriteria example);

    int updateByExample(@Param("record") Sc record, @Param("example") ScCriteria example);

    int updateByPrimaryKeySelective(Sc record);

    int updateByPrimaryKey(Sc record);
    
    
}