package hr.mapper;

import hr.entity.EngageInterview;
import hr.entity.EngageInterviewExample;
import hr.entity.EngageInterviewWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngageInterviewMapper {
    int countByExample(EngageInterviewExample example);

    int deleteByExample(EngageInterviewExample example);

    int deleteByPrimaryKey(Integer einId);

    int insert(EngageInterviewWithBLOBs record);

    int insertSelective(EngageInterviewWithBLOBs record);

    List<EngageInterviewWithBLOBs> selectByExampleWithBLOBs(EngageInterviewExample example);

    List<EngageInterview> selectByExample(EngageInterviewExample example);

    EngageInterviewWithBLOBs selectByPrimaryKey(Integer einId);

    int updateByExampleSelective(@Param("record") EngageInterviewWithBLOBs record, @Param("example") EngageInterviewExample example);

    int updateByExampleWithBLOBs(@Param("record") EngageInterviewWithBLOBs record, @Param("example") EngageInterviewExample example);

    int updateByExample(@Param("record") EngageInterview record, @Param("example") EngageInterviewExample example);

    int updateByPrimaryKeySelective(EngageInterviewWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EngageInterviewWithBLOBs record);

    int updateByPrimaryKey(EngageInterview record);
}