package csc.hfz.controller;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import csc.hfz.common.TaotaoResult;
import csc.hfz.pojo.UserList;
import csc.hfz.service.userService;

@Controller
@RequestMapping("/user")
public class userController {
    
	@Autowired
	private userService userService;
	
	
	
	//注册
	@RequestMapping(value="/register",method = RequestMethod.POST)
	@ResponseBody
	public TaotaoResult saveUser(UserList userList){
		try {
			TaotaoResult result = userService.saveUser(userList);
			return result;
		} catch (Exception e) {
			return TaotaoResult.build(500, e.getMessage());
		}
	}
	
	//登录
	@RequestMapping(value="/login",method = RequestMethod.POST)
	@ResponseBody
	public TaotaoResult userLogin(String username, String password,
			HttpSession session){
		try {       
			TaotaoResult result = userService.userLogin(username, password,session);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return TaotaoResult.build(500, e.getMessage());
		}
	}
	
	//注销
	@RequestMapping("/exit")
	public String LoginOut(HttpSession session){
		userService.LoginOut(session);
		return "redirect:/";
	}
	
	//验证注册信息
	@RequestMapping("/check/{param}/{type}")
	@ResponseBody
	public Object checkData(@PathVariable String param,
			@PathVariable Integer type, String callback) {

		TaotaoResult result = null;

		// 参数有效性校验
		if (StringUtils.isBlank(param)) {
			result = TaotaoResult.build(400, "校验内容不能为空");
		}
		if (type == null) {
			result = TaotaoResult.build(400, "校验内容类型不能为空");
		}
		if (type != 1 && type != 2 ) {
			result = TaotaoResult.build(400, "校验内容类型错误");
		}
		// 校验出错
		if (null != result) {
			if (null != callback) {
				MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(
						result);
				mappingJacksonValue.setJsonpFunction(callback);
				return mappingJacksonValue;
			} else {
				return result;
			}
		}
		// 调用服务
		try {
			result = userService.checkTbUser(param, type);

		} catch (Exception e) {
			result = TaotaoResult.build(500, e.getMessage());
		}

		if (null != callback) {
			MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(
					result);
			mappingJacksonValue.setJsonpFunction(callback);
			return mappingJacksonValue;
		} else {
			return result;
		}
	}
}
