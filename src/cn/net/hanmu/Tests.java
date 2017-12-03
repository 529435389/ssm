package cn.net.hanmu;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.net.hanmu.bean.User;
import cn.net.hanmu.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:config/spring-mybatis.xml" })
public class Tests {
	private static Logger logger = Logger.getLogger(Tests.class);
	// privateApplicationContext ac = null;
	@Resource
	private IUserService userService = null;

	// @Before
	// public voidbefore() {
	// ac= new ClassPathXmlApplicationContext("applicationContext.xml");
	// userService= (IUserService) ac.getBean("userService");
	// }

	@Test
	public void test1() {
		User user = userService.getUserById("asdf");
		// System.out.println(user.getUserName());
		// logger.info("值："+user.getUserName());
		logger.info(user);
		logger.error("asd");
		logger.debug("asdf");;
	}
}
