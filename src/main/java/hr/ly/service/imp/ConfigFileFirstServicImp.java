package hr.ly.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.entity.ConfigFileFirstKind;
import hr.ly.service.ConfigFileFirstService;
import hr.mapper.ConfigFileFirstKindMapper;

@Service
public class ConfigFileFirstServicImp implements ConfigFileFirstService {

	@Autowired
	private ConfigFileFirstKindMapper mapper;
	
	//出现所有一级结构
	@Override
	public List<ConfigFileFirstKind> selectAllFirs() {
		return mapper.selectByExample(null);
	}

}
