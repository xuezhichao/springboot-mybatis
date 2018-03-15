package com.yunjinrong.springbootmybatis.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class User implements Serializable{

	private static final long serialVersionUID = 3826565669715537879L;
	@ApiModelProperty(value="id")
	private String id;
	@ApiModelProperty(value="用户姓名")
	private String name;
	@ApiModelProperty(value="用户年龄")
	private Integer age;
	@ApiModelProperty(value="用户密码")
	private String password;
	
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
