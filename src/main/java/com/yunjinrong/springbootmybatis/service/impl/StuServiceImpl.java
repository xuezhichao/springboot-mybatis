package com.yunjinrong.springbootmybatis.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yunjinrong.springbootmybatis.dao.StuMapper;
import com.yunjinrong.springbootmybatis.model.Student;
import com.yunjinrong.springbootmybatis.service.StuService;

@Service
public class StuServiceImpl implements StuService {

	@Resource
	StuMapper stuMapper;
	
	@Override
	public Student insertStu(Student stu) {
		stu=stuMapper.insertStu(stu);
		return stu;
	}

	@Override
	public Student updateStu(Student stu) {
		stu=stuMapper.updateStu(stu);
		return stu;
	}

	@Override
	public Student findStuById(String stuId) {
		return stuMapper.findStuById(stuId);
	}

	@Override
	public void delStu(String stuId) {
		stuMapper.delStu(stuId);
	}
}
