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
		return null;
	}
	
	//��ѯ��ǰ�û���Ȩ��
	@RequestMapping("/selectAllSysRightByUser")
	@ResponseBody // �ѷ��ص�����ת��JSON
	public List<Map<String,Object>> selectAllSysRightByUser(HttpSession sess,Integer id){
		//�õ����游�ڵ��id
		if(id==null) {
			id=0;
		}
		
		//�õ���ǰ�û�
		Users user = (Users) sess.getAttribute("user");
		//�õ���ǰ�û��Ľ�ɫ
		SysRole userrole = role.selectSysRoleById(user.getuRoleid());
		sess.setAttribute("role", userrole);
		//�õ��û���ɫ��Ȩ�޼���
		List<SysRight> rightlist = ser.selectAllSysRightByUser(userrole.getRoleId());

		//���ݸ�id���Ӳ˵�
				List<SysRight> list = MyUtil.getRightByParentId(rightlist, id);
				List<Map<String, Object>> meunList = new ArrayList<Map<String, Object>>();
				for (SysRight sysRight : list) {
					Map<String, Object> map = new HashMap<String, Object>();
					map.put("id", sysRight.getRightCode());
					map.put("text", sysRight.getRightText());
					if ("parent".equals(sysRight.getRightType())) {
						//�Ǹ�����۵�������Ϊ����ҳ���ϵ������ڵ��ʱ��������
						map.put("state", "closed");
					}else {
						//���ӽڵ�,������
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
