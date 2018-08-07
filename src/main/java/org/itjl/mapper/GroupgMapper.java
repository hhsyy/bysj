package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.Groupg;
import org.itjl.model.GroupgCriteria;

public interface GroupgMapper {
    int countByExample(GroupgCriteria example);

    int deleteByExample(GroupgCriteria example);

    int deleteByPrimaryKey(Integer group_id);

    int insert(Groupg record);

    int insertSelective(Groupg record);

    List<Groupg> selectByExample(GroupgCriteria example);

    Groupg selectByPrimaryKey(Integer group_id);

    int updateByExampleSelective(@Param("record") Groupg record, @Param("example") GroupgCriteria example);

    int updateByExample(@Param("record") Groupg record, @Param("example") GroupgCriteria example);

    int updateByPrimaryKeySelective(Groupg record);

    int updateByPrimaryKey(Groupg record);
}