package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.User_androle;
import org.itjl.model.User_androleCriteria;

public interface User_androleMapper {
    int countByExample(User_androleCriteria example);

    int deleteByExample(User_androleCriteria example);

    int deleteByPrimaryKey(Integer user_androle_id);

    int insert(User_androle record);

    int insertSelective(User_androle record);

    List<User_androle> selectByExample(User_androleCriteria example);

    User_androle selectByPrimaryKey(Integer user_androle_id);

    int updateByExampleSelective(@Param("record") User_androle record, @Param("example") User_androleCriteria example);

    int updateByExample(@Param("record") User_androle record, @Param("example") User_androleCriteria example);

    int updateByPrimaryKeySelective(User_androle record);

    int updateByPrimaryKey(User_androle record);
}