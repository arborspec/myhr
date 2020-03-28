package hr.ly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.entity.ConfigFileThirdKind;
import hr.ly.service.ConfigFileThirdService;

@Controller
@RequestMapping("/third")
public class ConfigFileThirdController {

	@Autowired
	private ConfigFileThirdService thirdser;
	
	@RequestMapping("/selectAllThirdById")
	@ResponseBody
	public List<ConfigFileThirdKind> selectAllThirdById(String id){
		List<ConfigFileThirdKind> list = thirdser.selectAllThirdById(id);
		return list;
	}
}
