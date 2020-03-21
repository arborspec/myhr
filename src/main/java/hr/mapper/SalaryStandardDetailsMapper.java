package hr.mapper;

import hr.entity.SalaryStandardDetails;
import hr.entity.SalaryStandardDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalaryStandardDetailsMapper {
    int countByExample(SalaryStandardDetailsExample example);

    int deleteByExample(SalaryStandardDetailsExample example);

    int deleteByPrimaryKey(Integer sdtId);

    int insert(SalaryStandardDetails record);

    int insertSelective(SalaryStandardDetails record);

    List<SalaryStandardDetails> selectByExample(SalaryStandardDetailsExample example);

    SalaryStandardDetails selectByPrimaryKey(Integer sdtId);

    int updateByExampleSelective(@Param("record") SalaryStandardDetails record, @Param("example") SalaryStandardDetailsExample example);

    int updateByExample(@Param("record") SalaryStandardDetails record, @Param("example") SalaryStandardDetailsExample example);

    int updateByPrimaryKeySelective(SalaryStandardDetails record);

    int updateByPrimaryKey(SalaryStandardDetails record);
}