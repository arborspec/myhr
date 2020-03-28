package hr.ly.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.entity.ConfigMajor;
import hr.entity.ConfigMajorExample;
import hr.ly.service.ConfigMajorService;
import hr.mapper.ConfigMajorMapper;

@Service
public class ConfigMajorServiceImp implements ConfigMajorService {

	@Autowired
	private ConfigMajorMapper mapper;
	
	@Override
	public List<ConfigMajor> selectAllMajor() {
		
		return mapper.selectByExample(null);
	}

	//根据职位类型查询相应的职位名称
	@Override
	public List<ConfigMajor> selectMajorById(String id) {
		ConfigMajorExample example=new ConfigMajorExample();
		example.createCriteria().andMajorKindIdEqualTo(id);
		return mapper.selectByExample(example);
	}

	
}
