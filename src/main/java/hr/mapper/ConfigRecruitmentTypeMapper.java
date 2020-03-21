package hr.mapper;

import hr.entity.ConfigRecruitmentType;
import hr.entity.ConfigRecruitmentTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigRecruitmentTypeMapper {
    int countByExample(ConfigRecruitmentTypeExample example);

    int deleteByExample(ConfigRecruitmentTypeExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(ConfigRecruitmentType record);

    int insertSelective(ConfigRecruitmentType record);

    List<ConfigRecruitmentType> selectByExample(ConfigRecruitmentTypeExample example);

    ConfigRecruitmentType selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") ConfigRecruitmentType record, @Param("example") ConfigRecruitmentTypeExample example);

    int updateByExample(@Param("record") ConfigRecruitmentType record, @Param("example") ConfigRecruitmentTypeExample example);

    int updateByPrimaryKeySelective(ConfigRecruitmentType record);

    int updateByPrimaryKey(ConfigRecruitmentType record);
}