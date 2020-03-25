package hr.ly.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.entity.ConfigFileSecondKind;
import hr.entity.ConfigFileSecondKindExample;
import hr.ly.service.ConfigSecondService;
import hr.mapper.ConfigFileSecondKindMapper;

@Service
public class ConfigSecondServiceImp implements ConfigSecondService {

	@Autowired
	private ConfigFileSecondKindMapper mapper;
	
	//根据一级结构id查询二级结构
	@Override
	public List<ConfigFileSecondKind> selectAllSecondById(Integer id) {
		ConfigFileSecondKindExample example=new ConfigFileSecondKindExample();
		String idd="0"+id;
		System.out.println("idd:"+idd);
		example.createCriteria().andFirstKindIdEqualTo(idd);
		return mapper.selectByExample(example);
	}

}
