package hr.ly.service;

import java.util.List;

import hr.entity.ConfigMajorDesignation;
import hr.entity.ConfigMajorDesignationExample;
import hr.util.MyPage;

public interface ConfigDesignationService {

	int insertDesign(ConfigMajorDesignation con);
	
	List<ConfigMajorDesignation> selectConfigDesignation(MyPage page);
	
	int selectCountDesignation();
	
	int deleteCountDesignation(int id);
	
	ConfigMajorDesignation selectConfigDesignationById(Integer id);
	
	int updateCountDesignation(ConfigMajorDesignation con);
}
