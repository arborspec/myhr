package hr.ly.mapper;

import java.util.List;

import hr.entity.ConfigMajorDesignation;
import hr.util.MyPage;

public interface LyConfigDesignationMapper {

	int insertConfigDesignation(ConfigMajorDesignation des);
	
	List<ConfigMajorDesignation> selectConfigDesignation(MyPage page);
	
	ConfigMajorDesignation selectConfigDesignationById(Integer id);
}
