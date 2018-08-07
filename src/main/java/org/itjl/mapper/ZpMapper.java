package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.Zp;
import org.itjl.model.ZpCriteria;

public interface ZpMapper {
    int countByExample(ZpCriteria example);

    int deleteByExample(ZpCriteria example);

    int deleteByPrimaryKey(Integer zp_id);

    int insert(Zp record);

    int insertSelective(Zp record);

    List<Zp> selectByExampleWithBLOBs(ZpCriteria example);

    List<Zp> selectByExample(ZpCriteria example);

    Zp selectByPrimaryKey(Integer zp_id);

    int updateByExampleSelective(@Param("record") Zp record, @Param("example") ZpCriteria example);

    int updateByExampleWithBLOBs(@Param("record") Zp record, @Param("example") ZpCriteria example);

    int updateByExample(@Param("record") Zp record, @Param("example") ZpCriteria example);

    int updateByPrimaryKeySelective(Zp record);

    int updateByPrimaryKeyWithBLOBs(Zp record);

    int updateByPrimaryKey(Zp record);
}