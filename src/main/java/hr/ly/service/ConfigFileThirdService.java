package hr.ly.service;

import java.util.List;

import hr.entity.ConfigFileThirdKind;

public interface ConfigFileThirdService {

	public List<ConfigFileThirdKind> selectAllThirdById(String id);
}
