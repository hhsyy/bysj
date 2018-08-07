package org.itjl.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itjl.fl.Hyb;
import org.itjl.model.Fx;
import org.itjl.model.FxCriteria;

public interface FxMapper {
    int countByExample(FxCriteria example);

    int deleteByExample(FxCriteria example);

    int deleteByPrimaryKey(Integer fx_id);

    int insert(Fx record);

    int insertSelective(Fx record);

    List<Fx> selectByExample(FxCriteria example);

    Fx selectByPrimaryKey(Integer fx_id);

    int updateByExampleSelective(@Param("record") Fx record, @Param("example") FxCriteria example);

    int updateByExample(@Param("record") Fx record, @Param("example") FxCriteria example);

    int updateByPrimaryKeySelective(Fx record);

    int updateByPrimaryKey(Fx record);

	List<Fx> selectByXzl();

	List<Fx> selectByDate(@Param("fx_bt")String fx_bt);
	
	List<Hyb> selectByCount();
}