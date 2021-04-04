package com.github.cloudgyb.shardingjdbc.rws.entity;

import lombok.Data;

/**
 * @author cloudgyb
 * 2021/3/26 14:35
 */
@Data
public class User {
	private Integer id;
	private String name;
	private int age;
	private String password;
}
