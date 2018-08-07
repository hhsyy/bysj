package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.Lb;
import org.itjl.model.LbCriteria;

public interface LbMapper {
    int countByExample(LbCriteria example);

    int deleteByExample(LbCriteria example);

    int deleteByPrimaryKey(Integer lb_id);

    int insert(Lb record);

    int insertSelective(Lb record);

    List<Lb> selectByExample(LbCriteria example);

    Lb selectByPrimaryKey(Integer lb_id);

    int updateByExampleSelective(@Param("record") Lb record, @Param("example") LbCriteria example);

    int updateByExample(@Param("record") Lb record, @Param("example") LbCriteria example);

    int updateByPrimaryKeySelective(Lb record);

    int updateByPrimaryKey(Lb record);
}