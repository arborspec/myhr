package hr.ly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.entity.ConfigRecruitmentType;
import hr.ly.service.ConfigTypeService;

@Controller
@RequestMapping("/type")
public class ConfigTypeController {

	// 招聘类型service对象
	@Autowired
	private ConfigTypeService typeser;
	
	@RequestMapping("/selectAllType")
	@ResponseBody
	public List<ConfigRecruitmentType> selectAllType(){
		return typeser.selectConfigType();
	}
}
