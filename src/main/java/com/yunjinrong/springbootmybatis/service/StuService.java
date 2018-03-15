package com.yunjinrong.springbootmybatis.service;

import com.yunjinrong.springbootmybatis.model.Student;

public interface StuService {

	public Student insertStu(Student stu);
	
	public Student updateStu(Student stu);
	
	public Student findStuById(String stuId);
	
	public void delStu(String stuId);
}
