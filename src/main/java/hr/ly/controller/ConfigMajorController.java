package hr.ly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.entity.ConfigMajor;
import hr.ly.service.ConfigMajorService;
@Controller
@RequestMapping("/major")
public class ConfigMajorController {

	//ְҵ����service����
	@Autowired
	private ConfigMajorService majorser;
	
	//����ְλ���Ͳ�ѯ��Ӧ��ְλ����	
	@RequestMapping("/selectMajorById")
	@ResponseBody
	public List<ConfigMajor> selectMajorById(String id){
		List<ConfigMajor> list = majorser.selectMajorById(id);
		System.out.println(list.toString());
		return list;
	}
}
