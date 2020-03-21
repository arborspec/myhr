package hr.mapper;

import hr.entity.HumanFileDig;
import hr.entity.HumanFileDigExample;
import hr.entity.HumanFileDigWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HumanFileDigMapper {
    int countByExample(HumanFileDigExample example);

    int deleteByExample(HumanFileDigExample example);

    int deleteByPrimaryKey(Integer hfdId);

    int insert(HumanFileDigWithBLOBs record);

    int insertSelective(HumanFileDigWithBLOBs record);

    List<HumanFileDigWithBLOBs> selectByExampleWithBLOBs(HumanFileDigExample example);

    List<HumanFileDig> selectByExample(HumanFileDigExample example);

    HumanFileDigWithBLOBs selectByPrimaryKey(Integer hfdId);

    int updateByExampleSelective(@Param("record") HumanFileDigWithBLOBs record, @Param("example") HumanFileDigExample example);

    int updateByExampleWithBLOBs(@Param("record") HumanFileDigWithBLOBs record, @Param("example") HumanFileDigExample example);

    int updateByExample(@Param("record") HumanFileDig record, @Param("example") HumanFileDigExample example);

    int updateByPrimaryKeySelective(HumanFileDigWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HumanFileDigWithBLOBs record);

    int updateByPrimaryKey(HumanFileDig record);
}