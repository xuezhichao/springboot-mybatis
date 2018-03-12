package com.yunjinrong.springbootmybatis.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

public class User {

	@ApiModelProperty(value="id")
	private Long id;
	@ApiModelProperty(value="用户姓名")
	private String name;// 用户姓名
	@ApiModelProperty(value="用户年龄")
	private Integer age;// 用户年龄
	@ApiModelProperty(value="用户密码")
	private String password;// 用户密码
	
	private int rows;
	
	private int page;
	
	public int getRows() {
		return rows;
	}

	public int getPage() {
		return page;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
