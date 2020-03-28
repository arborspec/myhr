package hr.ly.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.entity.ConfigMajorDesignation;
import hr.entity.ConfigMajorDesignationExample;
import hr.ly.mapper.LyConfigDesignationMapper;
import hr.ly.service.ConfigDesignationService;
import hr.mapper.ConfigMajorDesignationMapper;
import hr.util.MyPage;

@Service
public class ConfigDesignationServiceImp implements ConfigDesignationService {

	@Autowired
	private LyConfigDesignationMapper mapper;
	
	@Autowired
	private ConfigMajorDesignationMapper mydatisdes;
	
	//自动增长添加
	@Override
	public int insertDesign(ConfigMajorDesignation con) {

		return mapper.insertConfigDesignation(con);
	}
	
	//查询职位表和相关表
	@Override
	public List<ConfigMajorDesignation> selectConfigDesignation(MyPage page) {
		return mapper.selectConfigDesignation(page);
	}

	//查询总条数
	@Override
	public int selectCountDesignation() {
		return mydatisdes.countByExample(null);
	}

	//根据id删除
	@Override
	public int deleteCountDesignation(int id) {
		
		return mydatisdes.deleteByPrimaryKey(id);
	}

	//根据id查询职位表和相关表
	@Override
	public ConfigMajorDesignation selectConfigDesignationById(Integer id) {
		
		return mapper.selectConfigDesignationById(id);
	}

	
	
	/*
	 * updateByPrimaryKeySelective会对字段进行判断再更新(如果为Null就忽略更新)，如果你只想更新某一字段，可以用这个方法。
       updateByPrimaryKey对你注入的字段全部更新
	 * */
	//修改用户
	@Override
		public int updateCountDesignation(ConfigMajorDesignation con) {		
			return mydatisdes.updateByPrimaryKey(con);
		}
}
