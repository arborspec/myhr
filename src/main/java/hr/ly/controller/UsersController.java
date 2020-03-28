package hr.ly.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hr.entity.Users;
import hr.ly.service.UsersService;
import hr.util.MyPage;

@Controller
@RequestMapping("/users")

public class UsersController {
	@Autowired
	@Qualifier("user")
	public UsersService ser;

	//当前用户的登录
	@RequestMapping("/selectUserByuser")
	public String selectUserByuser(HttpSession sess, HttpServletResponse resp, Users user) {
		Users u = ser.selectUsersByUser(user);
		resp.setContentType("text/html;charset=utf-8");
		try {
			PrintWriter out= resp.getWriter();
			if (u != null) {
				// 把当前用户放在sess中
				sess.setAttribute("user", u);
				out.write("<script>location.href='../jsp/index.html'</script>");
			} else {
				out.write("<script>alert('用户名或密码错误');location.href='../jsp/login.html'</script>");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	//查询用户和角色
	@RequestMapping("/selectUsersByUser")
	@ResponseBody
	public Map<String,Object> selectUsersByUser(MyPage page){
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("total",ser.selectUserCount());
		map.put("rows",ser.selectUserRole(page));
		System.out.println(page);
		return map;
	}
	
	
	//添加用户
	@RequestMapping("/insertUser")
	@ResponseBody
	public Integer insertUser(Users user) {
		return ser.insertUser(user);
	}
	
	
	//根据id删除用户
	@RequestMapping("/deteleUser")
	@ResponseBody
	public Integer deteleUser(HttpServletResponse resp,Integer id) {
		
		int i=ser.deleteUser(id);
		resp.setContentType("text/html;charset=utf-8");
		try {
			PrintWriter out = resp.getWriter();
			if (i>0) {
				out.write("<script>alert('删除成功');location.href='../jsp/user/users.html'</script>");
			}else {
				out.write("<script>alert('删除失败');location.href='../jsp/user/users.html'</script>");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	//根据id查询需要修改的对象
	@RequestMapping("/updateUser")
	@ResponseBody
	public Users updateUser(Integer id) {
		System.out.println(id);
		Users users = ser.selectUserById(id);
		System.out.println("查询对象："+users);
		return null;
	}
}
