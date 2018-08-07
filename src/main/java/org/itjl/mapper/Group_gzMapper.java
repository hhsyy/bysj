package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.Group_gz;
import org.itjl.model.Group_gzCriteria;

public interface Group_gzMapper {
    int countByExample(Group_gzCriteria example);

    int deleteByExample(Group_gzCriteria example);

    int deleteByPrimaryKey(Integer group_gz_id);

    int insert(Group_gz record);

    int insertSelective(Group_gz record);

    List<Group_gz> selectByExample(Group_gzCriteria example);

    Group_gz selectByPrimaryKey(Integer group_gz_id);

    int updateByExampleSelective(@Param("record") Group_gz record, @Param("example") Group_gzCriteria example);

    int updateByExample(@Param("record") Group_gz record, @Param("example") Group_gzCriteria example);

    int updateByPrimaryKeySelective(Group_gz record);

    int updateByPrimaryKey(Group_gz record);
}