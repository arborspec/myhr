package hr.mapper;

import hr.entity.ConfigPrimaryKey;
import hr.entity.ConfigPrimaryKeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigPrimaryKeyMapper {
    int countByExample(ConfigPrimaryKeyExample example);

    int deleteByExample(ConfigPrimaryKeyExample example);

    int deleteByPrimaryKey(Integer prkId);

    int insert(ConfigPrimaryKey record);

    int insertSelective(ConfigPrimaryKey record);

    List<ConfigPrimaryKey> selectByExample(ConfigPrimaryKeyExample example);

    ConfigPrimaryKey selectByPrimaryKey(Integer prkId);

    int updateByExampleSelective(@Param("record") ConfigPrimaryKey record, @Param("example") ConfigPrimaryKeyExample example);

    int updateByExample(@Param("record") ConfigPrimaryKey record, @Param("example") ConfigPrimaryKeyExample example);

    int updateByPrimaryKeySelective(ConfigPrimaryKey record);

    int updateByPrimaryKey(ConfigPrimaryKey record);
}