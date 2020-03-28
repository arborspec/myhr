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


	    //һ���ṹservice����
		@Autowired
		private ConfigFileFirstService firstser;
		
		
		@RequestMapping("/selectAllFirst")
		@ResponseBody
		public List<ConfigFileFirstKind> selectAllFirst(){
			//��ѯ����һ������
			List<ConfigFileFirstKind> firstdate = firstser.selectAllFirs();
			return firstdate;
		}
}
