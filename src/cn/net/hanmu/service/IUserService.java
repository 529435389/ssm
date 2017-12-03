package cn.net.hanmu.service;

import cn.net.hanmu.bean.User;

public interface IUserService {
	public User getUserById(String userId);
	public User doLogin(String username,String pwd);
}
