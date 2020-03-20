package hr.ly.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.entity.SysRightRoleExample;
import hr.entity.SysRightRoleKey;
import hr.ly.mapper.SysRightRoleMapper;
import hr.ly.service.SysRightRoleKeyService;

@Service("rightrole")
public class SysRightRoleKeyServiceImp implements SysRightRoleKeyService{

	@Autowired
	private SysRightRoleMapper mapper;
	
	@Override
	public List<SysRightRoleKey> selectAllSysRightRoleKey(Integer kid) {
		SysRightRoleExample example=new SysRightRoleExample();
		example.createCriteria().andRoleIdEqualTo(kid);
		return mapper.selectByExample(example);
	}

}
