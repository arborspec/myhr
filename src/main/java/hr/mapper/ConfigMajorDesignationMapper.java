package hr.mapper;

import hr.entity.ConfigMajorDesignation;
import hr.entity.ConfigMajorDesignationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigMajorDesignationMapper {
    int countByExample(ConfigMajorDesignationExample example);

    int deleteByExample(ConfigMajorDesignationExample example);

    int deleteByPrimaryKey(Integer desId);

    int insert(ConfigMajorDesignation record);

    int insertSelective(ConfigMajorDesignation record);

    List<ConfigMajorDesignation> selectByExample(ConfigMajorDesignationExample example);

    ConfigMajorDesignation selectByPrimaryKey(Integer desId);

    int updateByExampleSelective(@Param("record") ConfigMajorDesignation record, @Param("example") ConfigMajorDesignationExample example);

    int updateByExample(@Param("record") ConfigMajorDesignation record, @Param("example") ConfigMajorDesignationExample example);

    int updateByPrimaryKeySelective(ConfigMajorDesignation record);

    int updateByPrimaryKey(ConfigMajorDesignation record);
}