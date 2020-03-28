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
	
	//����һ���ṹid��ѯ�����ṹ
	@Override
	public List<ConfigFileSecondKind> selectAllSecondById(String id) {
		ConfigFileSecondKindExample example=new ConfigFileSecondKindExample();
		example.createCriteria().andFirstKindIdEqualTo(id);
		return mapper.selectByExample(example);
	}

}
