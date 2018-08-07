package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.User_group;
import org.itjl.model.User_groupCriteria;

public interface User_groupMapper {
    int countByExample(User_groupCriteria example);

    int deleteByExample(User_groupCriteria example);

    int deleteByPrimaryKey(Integer user_group_id);

    int insert(User_group record);

    int insertSelective(User_group record);

    List<User_group> selectByExample(User_groupCriteria example);

    User_group selectByPrimaryKey(Integer user_group_id);

    int updateByExampleSelective(@Param("record") User_group record, @Param("example") User_groupCriteria example);

    int updateByExample(@Param("record") User_group record, @Param("example") User_groupCriteria example);

    int updateByPrimaryKeySelective(User_group record);

    int updateByPrimaryKey(User_group record);
}