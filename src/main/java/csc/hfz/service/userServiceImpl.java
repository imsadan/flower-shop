package csc.hfz.service;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import csc.hfz.common.CookieUtils;
import csc.hfz.common.JsonUtils;
import csc.hfz.common.TaotaoResult;
import csc.hfz.mapper.UserListMapper;
import csc.hfz.pojo.FlowerList;
import csc.hfz.pojo.UserList;
import csc.hfz.pojo.UserListExample;
import csc.hfz.pojo.UserListExample.Criteria;

@Service
public class userServiceImpl implements userService {

	@Autowired
	private UserListMapper userListMapper;

	@Override
	public TaotaoResult saveUser(UserList userList) {
		int uid = (int) (Math.random() * 9999);
		userList.setUid(uid);
		// 加密
		userList.setPassword(DigestUtils.md5DigestAsHex(userList.getPassword()
				.getBytes()));
		userList.setCreated(new Date());
		userList.setUpdated(new Date());
		userListMapper.insert(userList);
		return TaotaoResult.ok();
	}

	@Override
	public TaotaoResult userLogin(String username, String password,
			HttpSession httpSession) {
		UserListExample example = new UserListExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<UserList> list = userListMapper.selectByExample(example);
		if (list.size() == 0 || list == null) {
			return TaotaoResult.build(400, "用户名或密码错误");

		}

		UserList user = list.get(0);
		// 比对密码
		if (!DigestUtils.md5DigestAsHex(password.getBytes()).equals(
				user.getPassword())) {
			return TaotaoResult.build(400, "用户名或密码错误");
		}

		httpSession.setAttribute("userLogin", user);

		return TaotaoResult.ok(user);
	}

	@Override
	public TaotaoResult LoginOut(HttpSession httpSession) {
		httpSession.removeAttribute("userLogin");
		return TaotaoResult.ok();
	}

	@Override
	public TaotaoResult checkTbUser(String content, Integer type) {
		// 1,2分别表示username,email
		// 创建查询的条件
		UserListExample example = new UserListExample();
		Criteria criteria = example.createCriteria();
		if (1 == type) {
			criteria.andUsernameEqualTo(content);
		} else if (2 == type) {
			criteria.andEmailEqualTo(content);
		}
		// 查询
		List<UserList> list = userListMapper.selectByExample(example);
		if (list == null || list.size() == 0) {
			return TaotaoResult.ok(true);
		}
		return TaotaoResult.ok(false);
	}

}
