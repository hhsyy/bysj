package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.User_gz;
import org.itjl.model.User_gzCriteria;

public interface User_gzMapper {
    int countByExample(User_gzCriteria example);

    int deleteByExample(User_gzCriteria example);

    int deleteByPrimaryKey(Integer user_gz_id);

    int insert(User_gz record);

    int insertSelective(User_gz record);

    List<User_gz> selectByExample(User_gzCriteria example);

    User_gz selectByPrimaryKey(Integer user_gz_id);

    int updateByExampleSelective(@Param("record") User_gz record, @Param("example") User_gzCriteria example);

    int updateByExample(@Param("record") User_gz record, @Param("example") User_gzCriteria example);

    int updateByPrimaryKeySelective(User_gz record);

    int updateByPrimaryKey(User_gz record);
}