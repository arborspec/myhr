package hr.mapper;

import hr.entity.EngageResume;
import hr.entity.EngageResumeExample;
import hr.entity.EngageResumeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngageResumeMapper {
    int countByExample(EngageResumeExample example);

    int deleteByExample(EngageResumeExample example);

    int deleteByPrimaryKey(Integer resId);

    int insert(EngageResumeWithBLOBs record);

    int insertSelective(EngageResumeWithBLOBs record);

    List<EngageResumeWithBLOBs> selectByExampleWithBLOBs(EngageResumeExample example);

    List<EngageResume> selectByExample(EngageResumeExample example);

    EngageResumeWithBLOBs selectByPrimaryKey(Integer resId);

    int updateByExampleSelective(@Param("record") EngageResumeWithBLOBs record, @Param("example") EngageResumeExample example);

    int updateByExampleWithBLOBs(@Param("record") EngageResumeWithBLOBs record, @Param("example") EngageResumeExample example);

    int updateByExample(@Param("record") EngageResume record, @Param("example") EngageResumeExample example);

    int updateByPrimaryKeySelective(EngageResumeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EngageResumeWithBLOBs record);

    int updateByPrimaryKey(EngageResume record);
}