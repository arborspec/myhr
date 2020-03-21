package hr.mapper;

import hr.entity.MajorChange;
import hr.entity.MajorChangeExample;
import hr.entity.MajorChangeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MajorChangeMapper {
    int countByExample(MajorChangeExample example);

    int deleteByExample(MajorChangeExample example);

    int deleteByPrimaryKey(Integer mchId);

    int insert(MajorChangeWithBLOBs record);

    int insertSelective(MajorChangeWithBLOBs record);

    List<MajorChangeWithBLOBs> selectByExampleWithBLOBs(MajorChangeExample example);

    List<MajorChange> selectByExample(MajorChangeExample example);

    MajorChangeWithBLOBs selectByPrimaryKey(Integer mchId);

    int updateByExampleSelective(@Param("record") MajorChangeWithBLOBs record, @Param("example") MajorChangeExample example);

    int updateByExampleWithBLOBs(@Param("record") MajorChangeWithBLOBs record, @Param("example") MajorChangeExample example);

    int updateByExample(@Param("record") MajorChange record, @Param("example") MajorChangeExample example);

    int updateByPrimaryKeySelective(MajorChangeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MajorChangeWithBLOBs record);

    int updateByPrimaryKey(MajorChange record);
}