package hr.ly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.entity.ConfigFileSecondKind;
import hr.ly.service.ConfigSecondService;

@Controller
@RequestMapping("/second")
public class ConfigSecondController {

	@Autowired
	private ConfigSecondService ser;
	
	
	@RequestMapping("/selectAllSecondById")
	@ResponseBody
	public List<ConfigFileSecondKind>selectAllSecondById(Integer id){
		System.out.println("二级结构需要id："+id);
		List<ConfigFileSecondKind> list = ser.selectAllSecondById(id);
		return list;
	}
}
