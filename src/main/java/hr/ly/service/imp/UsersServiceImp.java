package hr.ly.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.entity.Users;
import hr.entity.UsersExample;
import hr.ly.service.UsersService;
import hr.mapper.UsersMapper;
import hr.util.MyPage;

@Service("user")
public class UsersServiceImp implements UsersService{
	
	@Autowired
	private UsersMapper mapper;

	//用户登录
	@Override
	public Users selectUsersByUser(Users user) {
		UsersExample example=new UsersExample();
		//提交查询条件
		example.createCriteria().andUNameEqualTo(user.getuName()).andUPasswordEqualTo(user.getuPassword());
		List<Users> users = mapper.selectByExample(example);
		if (users.size()==0) {
			return null;
		}
		return users.get(0);
	}

	//查询用户和角色
	@Override
	public List<Users> selectUserRole(MyPage page) {
		
		return mapper.selectUserRole(page);
	}
	
    //查询一共有多少条数据
	@Override
	public Integer selectUserCount() {
		//逆向工厂查询总条数mapper.countByExample(null);
		int a=mapper.countByExample(null);
		System.out.println("总条数："+a);
		return a;
	}

	//添加用户
	@Override
	public int insertUser(Users user) {
		
		return mapper.insertUser(user);
	}

	//根据id删除用户
	@Override
	public int deleteUser(int id) {
		return mapper.deleteByPrimaryKey(id);
	}

	//根据id查询用户
	public Users selectUserById(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}
	
	
	

}
