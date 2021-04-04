package com.github.cloudgyb.shardingjdbc.ds.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * @author cloudgyb
 * 2021/3/26 14:35
 */
@Data
public class User implements Serializable {
	private Long id;
	private String name;
	private Integer age;
	private String password;
}
