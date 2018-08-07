package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.Sex;
import org.itjl.model.SexCriteria;

public interface SexMapper {
    int countByExample(SexCriteria example);

    int deleteByExample(SexCriteria example);

    int deleteByPrimaryKey(Integer sex_id);

    int insert(Sex record);

    int insertSelective(Sex record);

    List<Sex> selectByExample(SexCriteria example);

    Sex selectByPrimaryKey(Integer sex_id);

    int updateByExampleSelective(@Param("record") Sex record, @Param("example") SexCriteria example);

    int updateByExample(@Param("record") Sex record, @Param("example") SexCriteria example);

    int updateByPrimaryKeySelective(Sex record);

    int updateByPrimaryKey(Sex record);
}