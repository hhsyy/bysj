package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.User_lv;
import org.itjl.model.User_lvCriteria;

public interface User_lvMapper {
    int countByExample(User_lvCriteria example);

    int deleteByExample(User_lvCriteria example);

    int deleteByPrimaryKey(Integer user_lv_id);

    int insert(User_lv record);

    int insertSelective(User_lv record);

    List<User_lv> selectByExample(User_lvCriteria example);

    User_lv selectByPrimaryKey(Integer user_lv_id);

    int updateByExampleSelective(@Param("record") User_lv record, @Param("example") User_lvCriteria example);

    int updateByExample(@Param("record") User_lv record, @Param("example") User_lvCriteria example);

    int updateByPrimaryKeySelective(User_lv record);

    int updateByPrimaryKey(User_lv record);
}