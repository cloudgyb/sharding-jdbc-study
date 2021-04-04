package com.github.cloudgyb.shardingjdbc.ds.dao;

import java.util.List;

import com.github.cloudgyb.shardingjdbc.ds.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author cloudgyb
 * 2021/3/26 14:49
 */
@Mapper
public interface UserDao {

	@Select("select * from user")
	List<User> findAll();

	@Insert("insert into user(name,age,sex,password) value(#{name},#{age},#{sex},#{password})")
	void save(User user);
}
