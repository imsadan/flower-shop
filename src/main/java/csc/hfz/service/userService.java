package csc.hfz.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import csc.hfz.common.TaotaoResult;
import csc.hfz.pojo.UserList;

public interface userService {
    //注册用户
	TaotaoResult saveUser(UserList userList);
	//检验登录
	TaotaoResult userLogin(String username, String password,
			HttpSession httpSession);
	//注销
	TaotaoResult LoginOut(HttpSession httpSession);
	//验证注册
	TaotaoResult checkTbUser(String content, Integer type);
}
