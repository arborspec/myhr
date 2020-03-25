package hr.ly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.entity.ConfigMajorKind;
import hr.ly.service.ConfigKindService;

@Controller
@RequestMapping("/kind")
public class ConfigKindController {

	//职业分类service对象
	@Autowired
	private ConfigKindService kindser;
	
	@RequestMapping("/selectAllKind")
	@ResponseBody
	public List<ConfigMajorKind> selectAllKind(){
		return kindser.selectAllKind();
	}
}
