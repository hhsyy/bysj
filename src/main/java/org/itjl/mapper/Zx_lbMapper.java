package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.Zx_lb;
import org.itjl.model.Zx_lbCriteria;

public interface Zx_lbMapper {
    int countByExample(Zx_lbCriteria example);

    int deleteByExample(Zx_lbCriteria example);

    int insert(Zx_lb record);

    int insertSelective(Zx_lb record);

    List<Zx_lb> selectByExample(Zx_lbCriteria example);

    int updateByExampleSelective(@Param("record") Zx_lb record, @Param("example") Zx_lbCriteria example);

    int updateByExample(@Param("record") Zx_lb record, @Param("example") Zx_lbCriteria example);
}