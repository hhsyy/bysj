package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.model.Bk;
import org.itjl.model.BkCriteria;
import org.itjl.model.Zx;

public interface BkMapper {
    int countByExample(BkCriteria example);

    int deleteByExample(BkCriteria example);

    int deleteByPrimaryKey(Integer bk_id);

    int insert(Bk record);

    int insertSelective(Bk record);

    List<Bk> selectByExampleWithBLOBs(BkCriteria example);

    List<Bk> selectByExample(BkCriteria example);

    Bk selectByPrimaryKey(Integer bk_id);

    int updateByExampleSelective(@Param("record") Bk record, @Param("example") BkCriteria example);

    int updateByExampleWithBLOBs(@Param("record") Bk record, @Param("example") BkCriteria example);

    int updateByExample(@Param("record") Bk record, @Param("example") BkCriteria example);

    int updateByPrimaryKeySelective(Bk record);

    int updateByPrimaryKeyWithBLOBs(Bk record);

    int updateTjl(@Param("bk_tjl")int bk_tjl, @Param("bk_id")int bk_id);
    
    int updateByPrimaryKey(Bk record);

	List<Bk> selectByTj(@Param("bk_bq")String bk_bq, @Param("bk_bt")String bk_bt);
	
	List<Bk> selectByTjl();
}