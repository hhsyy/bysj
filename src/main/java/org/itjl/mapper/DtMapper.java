package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.Dt;
import org.itjl.model.DtCriteria;
import org.springframework.stereotype.Repository;


public interface DtMapper {
    int countByExample(DtCriteria example);

    int deleteByExample(DtCriteria example);

    int deleteByPrimaryKey(Integer dt_id);

    int insert(Dt record);

    int insertSelective(Dt record);

    List<Dt> selectByExample(DtCriteria example);

    Dt selectByPrimaryKey(Integer dt_id);

    int updateByExampleSelective(@Param("record") Dt record, @Param("example") DtCriteria example);

    int updateByExample(@Param("record") Dt record, @Param("example") DtCriteria example);

    int updateByPrimaryKeySelective(Dt record);

    int updateByPrimaryKey(Dt record);
}