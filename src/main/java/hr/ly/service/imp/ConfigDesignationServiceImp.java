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
	
	//�Զ��������
	@Override
	public int insertDesign(ConfigMajorDesignation con) {

		return mapper.insertConfigDesignation(con);
	}
	
	//��ѯְλ�����ر�
	@Override
	public List<ConfigMajorDesignation> selectConfigDesignation(MyPage page) {
		return mapper.selectConfigDesignation(page);
	}

	//��ѯ������
	@Override
	public int selectCountDesignation() {
		return mydatisdes.countByExample(null);
	}

	//����idɾ��
	@Override
	public int deleteCountDesignation(int id) {
		
		return mydatisdes.deleteByPrimaryKey(id);
	}

	//����id��ѯְλ�����ر�
	@Override
	public ConfigMajorDesignation selectConfigDesignationById(Integer id) {
		
		return mapper.selectConfigDesignationById(id);
	}

	
	
	/*
	 * updateByPrimaryKeySelective����ֶν����ж��ٸ���(���ΪNull�ͺ��Ը���)�������ֻ�����ĳһ�ֶΣ����������������
       updateByPrimaryKey����ע����ֶ�ȫ������
	 * */
	//�޸��û�
	@Override
		public int updateCountDesignation(ConfigMajorDesignation con) {		
			return mydatisdes.updateByPrimaryKey(con);
		}
}
