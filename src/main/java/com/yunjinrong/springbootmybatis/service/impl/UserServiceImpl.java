package com.yunjinrong.springbootmybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yunjinrong.springbootmybatis.mapper.UserMapper;
import com.yunjinrong.springbootmybatis.model.User;
import com.yunjinrong.springbootmybatis.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
    private UserMapper userMapper;
	
	@Override
	public String selectAgeByName(String name) {
		return userMapper.selectAgeByName(name);
	}

	@Override
	public int insertUser(User user) {
		return userMapper.insert(user);
	}

	@Override
	public int deleteUser(Long id) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateUserById(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKey(user);
	}

	@Override
	public User fingUserById(Long id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public Page<User> findUserList(int page, int rows) {
		PageHelper.startPage(page, rows);
		return userMapper.findUserList();
	}

}
