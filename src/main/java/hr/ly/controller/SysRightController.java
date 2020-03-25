package hr.ly.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.entity.SysRight;
import hr.entity.SysRole;
import hr.entity.Users;
import hr.ly.service.SysRightService;
import hr.ly.service.SysRoleService;
import hr.util.MyUtil;

@Controller()
@RequestMapping("right")
public class SysRightController {

	@Autowired
	@Qualifier("right")
	private SysRightService ser;
	
	@Autowired
	@Qualifier("role")
	private SysRoleService role;
	
	
	
	@RequestMapping("/selectAllSysRight")
	public List<SysRight> selectAllSysRight(){
		System.out.println("我是controller："+ser.selectAllSysRight());
		return null;
	}
	
	//查询当前用户的权限
	@RequestMapping("/selectAllSysRightByUser")
	@ResponseBody // 把返回的数据转成JSON
	public List<Map<String,Object>> selectAllSysRightByUser(HttpSession sess,Integer id){
		//得到界面父节点的id
		System.out.println("id：" + id);
		if(id==null) {
			id=0;
		}
		
		//得到当前用户
		Users user = (Users) sess.getAttribute("user");
		//得到当前用户的角色
		SysRole userrole = role.selectSysRoleById(user.getuRoleid());
		sess.setAttribute("role", userrole);
		//得到用户角色的权限集合
		List<SysRight> rightlist = ser.selectAllSysRightByUser(userrole.getRoleId());

		//根据父id找子菜单
				List<SysRight> list = MyUtil.getRightByParentId(rightlist, id);
				List<Map<String, Object>> meunList = new ArrayList<Map<String, Object>>();
				for (SysRight sysRight : list) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("id", sysRight.getRightCode());
					map.put("text", sysRight.getRightText());
					if ("parent".equals(sysRight.getRightType())) {
						//是父类就折叠起来，为了让页面上点击这个节点的时候发送请求
						map.put("state", "closed");
					}else {
						//是子节点,绑定属性
						Map<String,Object> attr=new HashMap<String, Object>();
						attr.put("url",sysRight.getRightUrl());
						attr.put("tip",sysRight.getRightTip());
						map.put("attributes",attr);
					}
					meunList.add(map);
				}
				return meunList;
	}
	
}
