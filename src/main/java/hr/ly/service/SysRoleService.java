package hr.ly.service;

import java.util.List;

import hr.entity.SysRole;

public interface SysRoleService {

	SysRole selectSysRoleById(Integer roleid);
	
	List<SysRole> selectSysRole();
}
