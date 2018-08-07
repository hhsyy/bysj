package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.User_permisson;
import org.itjl.model.User_permissonCriteria;

public interface User_permissonMapper {
    int countByExample(User_permissonCriteria example);

    int deleteByExample(User_permissonCriteria example);

    int deleteByPrimaryKey(Integer user_permisson_id);

    int insert(User_permisson record);

    int insertSelective(User_permisson record);

    List<User_permisson> selectByExample(User_permissonCriteria example);

    User_permisson selectByPrimaryKey(Integer user_permisson_id);

    int updateByExampleSelective(@Param("record") User_permisson record, @Param("example") User_permissonCriteria example);

    int updateByExample(@Param("record") User_permisson record, @Param("example") User_permissonCriteria example);

    int updateByPrimaryKeySelective(User_permisson record);

    int updateByPrimaryKey(User_permisson record);
}