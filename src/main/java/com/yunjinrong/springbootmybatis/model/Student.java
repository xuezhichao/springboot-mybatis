package com.yunjinrong.springbootmybatis.model;

import java.io.Serializable;

public class Student implements Serializable{

	private String id;
	
	private String name;
	
	private String grade;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
