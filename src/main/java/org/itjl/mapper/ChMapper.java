package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.Ch;
import org.itjl.model.ChCriteria;

public interface ChMapper {
    int countByExample(ChCriteria example);

    int deleteByExample(ChCriteria example);

    int deleteByPrimaryKey(Integer ch_id);

    int insert(Ch record);

    int insertSelective(Ch record);

    List<Ch> selectByExample(ChCriteria example);

    Ch selectByPrimaryKey(Integer ch_id);

    int updateByExampleSelective(@Param("record") Ch record, @Param("example") ChCriteria example);

    int updateByExample(@Param("record") Ch record, @Param("example") ChCriteria example);

    int updateByPrimaryKeySelective(Ch record);

    int updateByPrimaryKey(Ch record);
}