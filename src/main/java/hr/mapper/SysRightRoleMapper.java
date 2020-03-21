package hr.mapper;

import hr.entity.SysRightRoleExample;
import hr.entity.SysRightRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRightRoleMapper {
    int countByExample(SysRightRoleExample example);

    int deleteByExample(SysRightRoleExample example);

    int deleteByPrimaryKey(SysRightRoleKey key);

    int insert(SysRightRoleKey record);

    int insertSelective(SysRightRoleKey record);

    List<SysRightRoleKey> selectByExample(SysRightRoleExample example);

    int updateByExampleSelective(@Param("record") SysRightRoleKey record, @Param("example") SysRightRoleExample example);

    int updateByExample(@Param("record") SysRightRoleKey record, @Param("example") SysRightRoleExample example);
}