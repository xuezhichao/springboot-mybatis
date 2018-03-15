package com.yunjinrong.springbootmybatis.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.yunjinrong.springbootmybatis.dao.StuMapper;
import com.yunjinrong.springbootmybatis.model.Student;

@Repository
public class StuMapperImpl implements StuMapper {
	
	/**
	 * 由springboot自动注入，默认配置会产生mongoTemplate这个bean
	 */
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public Student insertStu(Student stu) {
		mongoTemplate.insert(stu);
		return stu;
	}

	@Override
	public Student updateStu(Student stu) {
		Criteria criteria = Criteria.where("id").is(stu.getId());
		Query query = new Query(criteria);
		Update update = Update.update("name", stu.getName()).set("grade", stu.getGrade());
		mongoTemplate.updateMulti(query, update, Student.class);
		return stu;
	}

	@Override
	public Student findStuById(String stuId) {
		return mongoTemplate.findOne(new Query(Criteria.where("id").is(stuId)), Student.class);
	}

	@Override
	public void delStu(String stuId) {
		Criteria criteria = Criteria.where("id").is(stuId);  
        Query query = new Query(criteria);
		mongoTemplate.remove(query,Student.class);
	}

}
