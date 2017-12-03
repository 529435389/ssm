package cn.net.hanmu.dao;

import java.util.HashMap;


import cn.net.hanmu.bean.User;

public interface UserMapper {
	int deleteByPrimaryKey(String id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
	
	User getByNameId(HashMap map);
	
	User doLogin(HashMap map);
}