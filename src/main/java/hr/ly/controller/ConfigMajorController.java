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

	//职业名称service对象
	@Autowired
	private ConfigMajorService majorser;
	
	//根据职位类型查询相应的职位名称	
	@RequestMapping("/selectMajorById")
	@ResponseBody
	public List<ConfigMajor> selectMajorById(Integer id){
		System.out.println("id:"+id);
		List<ConfigMajor> list = majorser.selectMajorById(id);
		System.out.println(list.toString());
		return list;
	}
}
