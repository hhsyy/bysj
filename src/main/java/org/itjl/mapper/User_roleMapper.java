package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.User_role;
import org.itjl.model.User_roleCriteria;

public interface User_roleMapper {
    int countByExample(User_roleCriteria example);

    int deleteByExample(User_roleCriteria example);

    int deleteByPrimaryKey(Integer user_role_id);

    int insert(User_role record);

    int insertSelective(User_role record);

    List<User_role> selectByExample(User_roleCriteria example);

    User_role selectByPrimaryKey(Integer user_role_id);

    int updateByExampleSelective(@Param("record") User_role record, @Param("example") User_roleCriteria example);

    int updateByExample(@Param("record") User_role record, @Param("example") User_roleCriteria example);

    int updateByPrimaryKeySelective(User_role record);

    int updateByPrimaryKey(User_role record);
}