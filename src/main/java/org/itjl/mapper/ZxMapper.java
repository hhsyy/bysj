package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.Wd;
import org.itjl.model.Zx;
import org.itjl.model.ZxCriteria;

public interface ZxMapper {
    int countByExample(ZxCriteria example);

    int deleteByExample(ZxCriteria example);

    int deleteByPrimaryKey(Integer zx_id);

    int insert(Zx record);

    int insertSelective(Zx record);

    List<Zx> selectByExampleWithBLOBs(ZxCriteria example);

    List<Zx> selectByExample(ZxCriteria example);

    Zx selectByPrimaryKey(Integer zx_id);

    int updateByExampleSelective(@Param("record") Zx record, @Param("example") ZxCriteria example);

    int updateByExampleWithBLOBs(@Param("record") Zx record, @Param("example") ZxCriteria example);

    int updateByExample(@Param("record") Zx record, @Param("example") ZxCriteria example);

    int updateByPrimaryKeySelective(Zx record);

    int updateByPrimaryKeyWithBLOBs(Zx record);

    int updateByPrimaryKey(Zx record);
    
    List<Zx> selectByTj(@Param("zx_bt")String zx_bt,@Param("zx_lb_id")int zx_lb_id);

}