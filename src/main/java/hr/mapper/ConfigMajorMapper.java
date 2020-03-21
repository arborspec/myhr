package hr.mapper;

import hr.entity.ConfigMajor;
import hr.entity.ConfigMajorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigMajorMapper {
    int countByExample(ConfigMajorExample example);

    int deleteByExample(ConfigMajorExample example);

    int deleteByPrimaryKey(Integer makId);

    int insert(ConfigMajor record);

    int insertSelective(ConfigMajor record);

    List<ConfigMajor> selectByExample(ConfigMajorExample example);

    ConfigMajor selectByPrimaryKey(Integer makId);

    int updateByExampleSelective(@Param("record") ConfigMajor record, @Param("example") ConfigMajorExample example);

    int updateByExample(@Param("record") ConfigMajor record, @Param("example") ConfigMajorExample example);

    int updateByPrimaryKeySelective(ConfigMajor record);

    int updateByPrimaryKey(ConfigMajor record);
}