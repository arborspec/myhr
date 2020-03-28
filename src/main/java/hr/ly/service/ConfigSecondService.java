package hr.ly.service;

import java.util.List;

import hr.entity.ConfigFileSecondKind;

public interface ConfigSecondService {

	//根据一级结构id查询二级结构
	public List<ConfigFileSecondKind> selectAllSecondById(String id);
}
