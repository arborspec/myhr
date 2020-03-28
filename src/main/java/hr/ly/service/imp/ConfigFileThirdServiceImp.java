package hr.ly.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.entity.ConfigFileThirdKind;
import hr.entity.ConfigFileThirdKindExample;
import hr.ly.service.ConfigFileThirdService;
import hr.mapper.ConfigFileThirdKindMapper;

@Service
public class ConfigFileThirdServiceImp implements ConfigFileThirdService{
	@Autowired
	private ConfigFileThirdKindMapper mapper;

	@Override
	public List<ConfigFileThirdKind> selectAllThirdById(String id) {
		ConfigFileThirdKindExample exam=new ConfigFileThirdKindExample();
		exam.createCriteria().andSecondKindIdEqualTo(id);
		return mapper.selectByExample(exam);
	}

}
