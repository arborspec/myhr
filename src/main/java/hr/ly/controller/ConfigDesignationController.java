package hr.ly.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import hr.entity.ConfigMajorDesignation;
import hr.entity.ConfigMajorDesignationExample;
import hr.entity.SysRole;
import hr.entity.Users;
import hr.ly.service.ConfigDesignationService;
import hr.util.MyPage;


@Controller
@RequestMapping("/design")
public class ConfigDesignationController {

	
	@Autowired
	private ConfigDesignationService desser;
	
	
	//���ص�ǰ�û��ͽ�ɫ
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
	
	
	//�ύְҵ
	@RequestMapping("/insertConfigDesignation")
	@ResponseBody
	public String  insertConfigDesignation(HttpServletResponse resp,Integer desFfkId,Integer desFskId,Integer desFtkId,Integer desRecId,Integer desMfkId,Integer desMakId,Integer desNum,Date desExpirationDate,String desUser,Date desRecordDate,String desDescription,String desRequire) {
		ConfigMajorDesignation des=new ConfigMajorDesignation(desFfkId,desFskId,desFtkId,desRecId,desMfkId,desMakId,desNum,desExpirationDate,desUser,desRecordDate,desDescription,desRequire);
		int i = desser.insertDesign(des);
		resp.setContentType("text/html;charset=utf-8");
		try {
			PrintWriter out = resp.getWriter();
			if (i>0) {
				out.write("<script>alert('�����Ϣ�ɹ�');location.href='../jsp/invite/selectposition.html'</script>");
			}else {
				out.write("<script>alert('�����Ϣʧ��');location.href='../jsp/invite/position.html'</script>");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	//��ѯְҵ�������
	@RequestMapping("/selectConfigDesignation")
	@ResponseBody
	public Map<String, Object> selectConfigDesignation(MyPage page) {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("total",desser.selectCountDesignation());
		map.put("rows",desser.selectConfigDesignation(page));
		return map;
	}
	
	//����idɾ��
	@RequestMapping("/deleteCountDesignation")
	public String deleteCountDesignation(HttpServletResponse resp,Integer id) {
        int i = desser.deleteCountDesignation(id);
		resp.setContentType("text/html;charset=utf-8");
		try {
			PrintWriter out = resp.getWriter();
			if (i>0) {
				out.write("<script>alert('ɾ���ɹ�');location.href='../jsp/invite/selectposition.html'</script>");
			}else {
				out.write("<script>alert('ɾ��ʧ��');location.href='../jsp/invite/selectposition.html'</script>");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	//����id��ѯְҵ�������
	@RequestMapping("/selectConfigDesignationById")
	@ResponseBody
	public ConfigMajorDesignation selectConfigDesignationById(Integer id) {
		ConfigMajorDesignation design = desser.selectConfigDesignationById(id);
		return design;
	}
	
	
	//�޸�ְҵ
	@RequestMapping("/updateConfigDesignation")
	public String updateConfigDesignation(HttpServletResponse resp,Integer desId,Integer desFfkId,Integer desFskId,Integer desFtkId,Integer desRecId,Integer desMfkId,Integer desMakId,Integer desNum,Date desExpirationDate,String desUser,Date desRecordDate,String desDescription,String desRequire) {
		System.out.println("�ҽ�����");
		ConfigMajorDesignation des=new ConfigMajorDesignation(desFfkId,desFskId,desFtkId,desRecId,desMfkId,desMakId,desNum,desExpirationDate,desUser,desRecordDate,desDescription,desRequire);
		des.setDesId(desId);
		int i = desser.updateCountDesignation(des);
		resp.setContentType("text/html;charset=utf-8");
		try {
			PrintWriter out = resp.getWriter();
			if (i>0) {
				out.write("<script>alert('�޸ĳɹ�');location.href='../jsp/invite/selectposition.html'</script>");
			}else {
				out.write("<script>alert('�޸�ʧ��');location.href='../jsp/invite/selectposition.html'</script>");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
