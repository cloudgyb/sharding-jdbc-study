package com.github.cloudgyb.shardingjdbc.ds.controller;

import java.util.List;

import com.github.cloudgyb.shardingjdbc.ds.dao.UserDao;
import com.github.cloudgyb.shardingjdbc.ds.entity.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public String addUser(@RequestParam(name = "age",defaultValue = "1") Integer age){
		User user = new User();
		user.setName("耿");
		user.setAge(age);
		user.setPassword("123456");
		userDao.save(user);
		return "OK!";
	}
}
