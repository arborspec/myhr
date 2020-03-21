package hr.ly.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.entity.SysRight;
import hr.entity.SysRightExample;
import hr.ly.service.SysRightService;
import hr.mapper.SysRightMapper;



@Service("right")
public class SysRightServiceImp implements SysRightService {

	@Autowired
	private SysRightMapper mapper;
	
	public List<SysRight> selectAllSysRight() {
		SysRightExample example =new SysRightExample();
		return mapper.selectByExample(example);
	}

	@Override
	public List<SysRight> selectAllSysRightByUser(Integer id) {	
		return mapper.selectAllSysRightByUser(id);
	}

}
