package hr.ly.service;

import java.util.List;

import hr.entity.ConfigMajor;

public interface ConfigMajorService {

	//��ѯ����ְλ����
	public List<ConfigMajor> selectAllMajor();
	
	//����ְλ���Ͳ�ѯ��Ӧ��ְλ����
	public List<ConfigMajor> selectMajorById(String id);
	
}
