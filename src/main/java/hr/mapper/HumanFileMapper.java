package hr.mapper;

import hr.entity.HumanFile;
import hr.entity.HumanFileExample;
import hr.entity.HumanFileWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HumanFileMapper {
    int countByExample(HumanFileExample example);

    int deleteByExample(HumanFileExample example);

    int deleteByPrimaryKey(Integer hfdId);

    int insert(HumanFileWithBLOBs record);

    int insertSelective(HumanFileWithBLOBs record);

    List<HumanFileWithBLOBs> selectByExampleWithBLOBs(HumanFileExample example);

    List<HumanFile> selectByExample(HumanFileExample example);

    HumanFileWithBLOBs selectByPrimaryKey(Integer hfdId);

    int updateByExampleSelective(@Param("record") HumanFileWithBLOBs record, @Param("example") HumanFileExample example);

    int updateByExampleWithBLOBs(@Param("record") HumanFileWithBLOBs record, @Param("example") HumanFileExample example);

    int updateByExample(@Param("record") HumanFile record, @Param("example") HumanFileExample example);

    int updateByPrimaryKeySelective(HumanFileWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HumanFileWithBLOBs record);

    int updateByPrimaryKey(HumanFile record);
}