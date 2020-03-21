package hr.ly.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.entity.SysRole;
import hr.ly.service.SysRoleService;
import hr.mapper.SysRoleMapper;

@Service("role")
public class SysRoleServiceImp implements SysRoleService{

	@Autowired
	private SysRoleMapper mapper;
	
	//根据id查询用户
	@Override
	public SysRole selectSysRoleById(Integer roleid) {	
		return mapper.selectByPrimaryKey(roleid);
	}

	//查询所有角色
	@Override
	public List<SysRole> selectSysRole() {	
		return mapper.selectByExample(null);
	}

}
