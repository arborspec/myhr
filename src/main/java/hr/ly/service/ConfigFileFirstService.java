package hr.ly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.entity.ConfigFileFirstKind;
import hr.mapper.ConfigFileFirstKindMapper;

//一级结构
public interface ConfigFileFirstService {

	//查询所有一级结构
	public List<ConfigFileFirstKind> selectAllFirs();
	
}
