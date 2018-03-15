package com.yunjinrong.springbootmybatis.dao;

import com.yunjinrong.springbootmybatis.model.Student;

public interface StuMapper {
	
	public Student insertStu(Student stu);
	
	public Student updateStu(Student stu);
	
	public Student findStuById(String stuId);
	
	public void delStu(String stuId);
}
