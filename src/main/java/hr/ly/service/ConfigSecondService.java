package hr.ly.service;

import java.util.List;

import hr.entity.ConfigFileSecondKind;

public interface ConfigSecondService {

	//����һ���ṹid��ѯ�����ṹ
	public List<ConfigFileSecondKind> selectAllSecondById(String id);
}
