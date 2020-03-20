package hr.ly.service;

import java.util.List;

import hr.entity.SysRight;

public interface SysRightService {

	//查询所有权限
	List<SysRight> selectAllSysRight();
	
	//查询当前用户的使用权限
	List<SysRight> selectAllSysRightByUser(Integer id);
}
