package com.github.cloudgyb.shardingjdbc.rws.controller;

import java.util.List;

import com.github.cloudgyb.shardingjdbc.rws.dao.UserDao;
import com.github.cloudgyb.shardingjdbc.rws.entity.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cloudgyb
 * 2021/3/26 14:51
 */

@RestController
public class UserController {
	private final UserDao userDao;

	UserController(UserDao userDao) {
		this.userDao = userDao;
	}

	@GetMapping("/user/list")
	public List<User> showAll(){
		return userDao.findAll();
	}

	@GetMapping("/user/add")
	public String addUser(){
		User user = new User();
		user.setName("耿");
		user.setAge(12);
		user.setPassword("123456");
		userDao.save(user);
		return "OK!";
	}
}
