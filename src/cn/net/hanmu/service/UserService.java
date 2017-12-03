package cn.net.hanmu.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.net.hanmu.bean.User;
import cn.net.hanmu.dao.UserMapper;

@Service("userService")
public class UserService implements IUserService {
	@Autowired
	UserMapper userDao;

	@Override
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap<>();
		map.put("username", "asdf");
		map.put("id", "fff");
		return this.userDao.getByNameId(map);
	}

	@Override
	public User doLogin(String username, String pwd) {
		HashMap map = new HashMap<>();
		map.put("username", username);
		map.put("pwd", pwd);
		return this.userDao.doLogin(map);
	}


}
