package hr.mapper;

import hr.entity.SalaryStandard;
import hr.entity.SalaryStandardExample;
import hr.entity.SalaryStandardWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalaryStandardMapper {
    int countByExample(SalaryStandardExample example);

    int deleteByExample(SalaryStandardExample example);

    int deleteByPrimaryKey(Integer ssdId);

    int insert(SalaryStandardWithBLOBs record);

    int insertSelective(SalaryStandardWithBLOBs record);

    List<SalaryStandardWithBLOBs> selectByExampleWithBLOBs(SalaryStandardExample example);

    List<SalaryStandard> selectByExample(SalaryStandardExample example);

    SalaryStandardWithBLOBs selectByPrimaryKey(Integer ssdId);

    int updateByExampleSelective(@Param("record") SalaryStandardWithBLOBs record, @Param("example") SalaryStandardExample example);

    int updateByExampleWithBLOBs(@Param("record") SalaryStandardWithBLOBs record, @Param("example") SalaryStandardExample example);

    int updateByExample(@Param("record") SalaryStandard record, @Param("example") SalaryStandardExample example);

    int updateByPrimaryKeySelective(SalaryStandardWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SalaryStandardWithBLOBs record);

    int updateByPrimaryKey(SalaryStandard record);
}