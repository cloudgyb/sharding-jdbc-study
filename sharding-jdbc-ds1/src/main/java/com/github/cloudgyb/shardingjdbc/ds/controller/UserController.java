package com.github.cloudgyb.shardingjdbc.ds.controller;

import java.util.List;

import com.github.cloudgyb.shardingjdbc.ds.dao.UserDao;
import com.github.cloudgyb.shardingjdbc.ds.entity.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

	@PostMapping("/user/add")
	public String addUser(@RequestParam(name = "name") String name,
			@RequestParam(name = "age",defaultValue = "1") Integer age,
			@RequestParam(name = "sex",defaultValue = "0") Integer sex){
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setSex(sex);
		user.setPassword("123456");
		userDao.save(user);
		return "OK!";
	}
}
