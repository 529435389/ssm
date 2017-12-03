package cn.net.hanmu.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.druid.support.json.JSONUtils;

import cn.net.hanmu.bean.User;
import cn.net.hanmu.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private IUserService userService;

	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request, Model model) {
		String userId = request.getParameter("id");
		User user = this.userService.getUserById(userId);
		model.addAttribute("asdf", user);
		return "showUser";
	}
	
	@ResponseBody
	@RequestMapping("/doLogin")
	public Map doLogin(HttpServletRequest request, Model model) {
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		User loginRet = userService.doLogin(username, pwd);
		Map ret = new HashMap<>();
		if (null == loginRet || null == loginRet.getId()) {
			ret.put("status", "0");
		}else{
			HttpSession session = request.getSession();
			session.setAttribute("userInfo", loginRet);
			ret.put("status", "1");
		}
		model.addAttribute("json", JSONUtils.toJSONString(ret));
		return ret;
	}

}
