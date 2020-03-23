package hr.ly.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.entity.ConfigRecruitmentType;
import hr.ly.service.ConfigTypeService;
import hr.mapper.ConfigRecruitmentTypeMapper;

@Service
public class ConfigTypeServicImp implements ConfigTypeService {

	@Autowired
	private ConfigRecruitmentTypeMapper mapper;
	//≤È—Ø’–∆∏¿‡–Õ
	@Override
	public List<ConfigRecruitmentType> selectConfigType() {
		return mapper.selectByExample(null);
	}

}
