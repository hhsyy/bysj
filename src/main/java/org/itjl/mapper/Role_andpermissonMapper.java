package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.Role_andpermisson;
import org.itjl.model.Role_andpermissonCriteria;

public interface Role_andpermissonMapper {
    int countByExample(Role_andpermissonCriteria example);

    int deleteByExample(Role_andpermissonCriteria example);

    int deleteByPrimaryKey(Integer role_andpermisson_id);

    int insert(Role_andpermisson record);

    int insertSelective(Role_andpermisson record);

    List<Role_andpermisson> selectByExample(Role_andpermissonCriteria example);

    Role_andpermisson selectByPrimaryKey(Integer role_andpermisson_id);

    int updateByExampleSelective(@Param("record") Role_andpermisson record, @Param("example") Role_andpermissonCriteria example);

    int updateByExample(@Param("record") Role_andpermisson record, @Param("example") Role_andpermissonCriteria example);

    int updateByPrimaryKeySelective(Role_andpermisson record);

    int updateByPrimaryKey(Role_andpermisson record);
}