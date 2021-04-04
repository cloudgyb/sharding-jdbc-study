package com.github.cloudgyb.shardingjdbc.ds.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * 用户实体
 * @author cloudgyb
 * 2021/3/26 14:35
 */
@Data
public class User implements Serializable {
	private Long id;
	private String name;
	private String password;
	private Integer age;
	private Integer sex = 0;
}
