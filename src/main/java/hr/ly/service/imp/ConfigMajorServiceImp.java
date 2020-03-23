package hr.ly.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hr.entity.ConfigMajor;
import hr.ly.service.ConfigMajorService;

public class ConfigMajorServiceImp implements ConfigMajorService {

	@Autowired
	
	@Override
	public List<ConfigMajor> selectAllMajor() {
		
		return null;
	}

	
}
