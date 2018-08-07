package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.User_group_permisson;
import org.itjl.model.User_group_permissonCriteria;

public interface User_group_permissonMapper {
    int countByExample(User_group_permissonCriteria example);

    int deleteByExample(User_group_permissonCriteria example);

    int deleteByPrimaryKey(Integer user_group_permisson_id);

    int insert(User_group_permisson record);

    int insertSelective(User_group_permisson record);

    List<User_group_permisson> selectByExample(User_group_permissonCriteria example);

    User_group_permisson selectByPrimaryKey(Integer user_group_permisson_id);

    int updateByExampleSelective(@Param("record") User_group_permisson record, @Param("example") User_group_permissonCriteria example);

    int updateByExample(@Param("record") User_group_permisson record, @Param("example") User_group_permissonCriteria example);

    int updateByPrimaryKeySelective(User_group_permisson record);

    int updateByPrimaryKey(User_group_permisson record);
}