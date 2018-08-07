package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.Xq;
import org.itjl.model.XqCriteria;

public interface XqMapper {
    int countByExample(XqCriteria example);

    int deleteByExample(XqCriteria example);

    int deleteByPrimaryKey(Integer xq_id);

    int insert(Xq record);

    int insertSelective(Xq record);

    List<Xq> selectByExampleWithBLOBs(XqCriteria example);

    List<Xq> selectByExample(XqCriteria example);

    Xq selectByPrimaryKey(Integer xq_id);

    int updateByExampleSelective(@Param("record") Xq record, @Param("example") XqCriteria example);

    int updateByExampleWithBLOBs(@Param("record") Xq record, @Param("example") XqCriteria example);

    int updateByExample(@Param("record") Xq record, @Param("example") XqCriteria example);

    int updateByPrimaryKeySelective(Xq record);

    int updateByPrimaryKeyWithBLOBs(Xq record);

    int updateByPrimaryKey(Xq record);
}