package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.Wd_fl;
import org.itjl.model.Wd_flCriteria;

public interface Wd_flMapper {
    int countByExample(Wd_flCriteria example);

    int deleteByExample(Wd_flCriteria example);

    int deleteByPrimaryKey(Integer wd_fl_id);

    int insert(Wd_fl record);

    int insertSelective(Wd_fl record);

    List<Wd_fl> selectByExample(Wd_flCriteria example);

    Wd_fl selectByPrimaryKey(Integer wd_fl_id);

    int updateByExampleSelective(@Param("record") Wd_fl record, @Param("example") Wd_flCriteria example);

    int updateByExample(@Param("record") Wd_fl record, @Param("example") Wd_flCriteria example);

    int updateByPrimaryKeySelective(Wd_fl record);

    int updateByPrimaryKey(Wd_fl record);
}