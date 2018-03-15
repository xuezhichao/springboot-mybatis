package com.yunjinrong.springbootmybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.github.pagehelper.Page;
import com.yunjinrong.springbootmybatis.model.User;

@Mapper
public interface UserMapper {
	String selectAgeByName(String name);// 根据姓名读取年龄

	int deleteByPrimaryKey(String id);

	int insert(User record);

	User selectByPrimaryKey(String id);

	List<User> selectAll();

	int updateByPrimaryKey(User record);
	
	public Page<User> findUserList();
}
