package hr.ly.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.entity.ConfigFileFirstKind;
import hr.entity.ConfigMajor;
import hr.entity.ConfigMajorKind;
import hr.entity.ConfigRecruitmentType;
import hr.entity.SysRole;
import hr.entity.Users;
import hr.ly.service.ConfigFileFirstService;
import hr.ly.service.ConfigKindService;
import hr.ly.service.ConfigMajorService;
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
	
	//职业名称service对象
	@Autowired
	private ConfigMajorService majorser;
	
	
	//返回当前用户和角色
	@RequestMapping("/selectUserandRole")
	@ResponseBody
	public Map<String, Object> selectUserandRole(HttpSession sess){
		Map<String,Object> map=new HashMap<String, Object>();
		Users user = (Users) sess.getAttribute("user");
		map.put("user", user);
	    SysRole role = (SysRole) sess.getAttribute("role");
	    map.put("role",role);
	    return map;
	}
}
