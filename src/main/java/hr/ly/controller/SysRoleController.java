package hr.ly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.entity.SysRole;
import hr.ly.service.SysRoleService;

@Controller
@RequestMapping("role")
public class SysRoleController {

	@Autowired
	private SysRoleService ser;
	
	@RequestMapping("/selectAllSysRole")
	@ResponseBody
	public List<SysRole> selectAllSysRole(){
		return ser.selectSysRole();
	}
}
