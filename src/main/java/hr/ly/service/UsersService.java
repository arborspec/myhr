package hr.ly.service;

import java.util.List;

import hr.entity.Users;
import hr.util.MyPage;

public interface UsersService {

	//登录，根据用户名密码查询用户对象
	Users selectUsersByUser(Users user); 
	
	//分页查询
	List<Users> selectUserRole(MyPage page);
	
	//查询一共几条数据
	Integer selectUserCount();
	
	//添加用户
	int insertUser(Users user);
	
	//根据id删除用户
	int deleteUser(int id);
}
