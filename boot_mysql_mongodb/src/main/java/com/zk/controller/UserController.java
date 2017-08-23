package com.zk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zk.mapper.mongodb.UserDao;
import com.zk.mapper.mysql.UserMapper;
import com.zk.model.User;

/**
 * @date 2017年8月23日13:29:48
 * 
 * @author zk
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserDao userDao;

	@Autowired
	private UserMapper userMapper;

	@GetMapping("/saveUser")
	public int saveUser() {
		int n = 0;
		User user = new User();
		for (int i = 1; i < 100; i++) {
			user.setUsername("123");
			user.setPassword("123");
			this.userDao.saveUser(user);
		}
		return n;
	}

	@GetMapping("/save")
	public int save() {
		int n = 0;
		User user = new User();
		user.setUsername("1");
		user.setPassword("1");
		n = this.userMapper.saveUser(user);
		return n;
	}
}
