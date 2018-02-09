package com.yunjinrong.springbootmybatis.model;

public class User {

	private Long id;
	private String name;// 用户姓名
	private Integer age;// 用户年龄
	private String password;// 用户密码

	
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
