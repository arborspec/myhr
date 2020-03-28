package hr.ly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.entity.ConfigFileFirstKind;
import hr.ly.service.ConfigFileFirstService;

@Controller
@RequestMapping("/first")
public class ConfigFileFirstController {


	    //一级结构service对象
		@Autowired
		private ConfigFileFirstService firstser;
		
		
		@RequestMapping("/selectAllFirst")
		@ResponseBody
		public List<ConfigFileFirstKind> selectAllFirst(){
			//查询所有一级对象
			List<ConfigFileFirstKind> firstdate = firstser.selectAllFirs();
			return firstdate;
		}
}
