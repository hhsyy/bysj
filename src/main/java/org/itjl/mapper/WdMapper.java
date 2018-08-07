package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.fl.Hyb;
import org.itjl.model.Wd;
import org.itjl.model.WdCriteria;

public interface WdMapper {
    int countByExample(WdCriteria example);

    int deleteByExample(WdCriteria example);

    int deleteByPrimaryKey(Integer wd_id);

    int insert(Wd record);

    int insertSelective(Wd record);

    List<Wd> selectByExampleWithBLOBs(WdCriteria example);

    List<Wd> selectByExample(WdCriteria example);

    Wd selectByPrimaryKey(Integer wd_id);

    int updateByExampleSelective(@Param("record") Wd record, @Param("example") WdCriteria example);

    int updateByExampleWithBLOBs(@Param("record") Wd record, @Param("example") WdCriteria example);

    int updateByExample(@Param("record") Wd record, @Param("example") WdCriteria example);

    int updateByPrimaryKeySelective(Wd record);

    int updateByPrimaryKeyWithBLOBs(Wd record);

    int updateByPrimaryKey(Wd record);
    
    List<Hyb> selectByUser();

	List<Wd> selectByFlid(@Param("wd_bt")String wd_bt,@Param("wd_fl_id")int wd_fl_id);

}