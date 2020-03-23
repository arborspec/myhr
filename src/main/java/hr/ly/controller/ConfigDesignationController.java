package hr.ly.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.entity.ConfigFileFirstKind;
import hr.entity.ConfigMajorKind;
import hr.entity.ConfigRecruitmentType;
import hr.entity.Users;
import hr.ly.service.ConfigFileFirstService;
import hr.ly.service.ConfigKindService;
import hr.ly.service.ConfigTypeService;

@Controller
@RequestMapping("/design")
public class ConfigDesignationController {

	//一级结构service对象
	@Autowired
	private ConfigFileFirstService firstser;
	
	//招聘类型service对象
	@Autowired
	private ConfigTypeService typeser;
	
	//职业分类service对象
	@Autowired
	private ConfigKindService kindser;
	
	@RequestMapping("/selectConfigDesignation")
	public Map<String, Object> selectConfigDesignation(HttpSession sess){
		//查询所有一级对象
		List<ConfigFileFirstKind> firstdate = firstser.selectAllFirs();
		System.out.println("一级对象："+firstdate);
		//得到当前对象的数据
		Users userdate = (Users)sess.getAttribute("user");
		System.out.println("当前对象："+userdate);
		//得到所有招聘类型
		List<ConfigRecruitmentType> types = typeser.selectConfigType();
		System.out.println("所有招聘类型："+types.toString());
		//得到所有职业对象
		List<ConfigMajorKind> kinds = kindser.selectAllKind();
		System.out.println("所有职业分类对象:"+kinds.toString());
		return null;
	}
}
