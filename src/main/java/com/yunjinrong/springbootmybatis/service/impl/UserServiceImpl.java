package com.yunjinrong.springbootmybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
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
	//@CachePut缓存新增的或更新的数据到缓存,其中缓存名字是 people 。数据的key是person的id
    @CachePut(value = "user", key = "#p0.id")
	public int insertUser(User user) {
		return userMapper.insert(user);
	}

	@Override
	//@CacheEvict 从缓存people中删除key为id 的数据
    @CacheEvict(value = "user")
	public int deleteUser(Long id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	//@CachePut缓存新增的或更新的数据到缓存,其中缓存名字是 people 。数据的key是person的id
    @CachePut(value = "user", key = "#user.id")
	public int updateUserById(User user) {
		return userMapper.updateByPrimaryKey(user);
	}

	@Override
	//@Cacheable缓存key为person 的id 数据到缓存people 中,如果没有指定key则方法参数作为key保存到缓存中。
    @Cacheable(value = "user", key = "#id")
	public User fingUserById(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public Page<User> findUserList(int page, int rows) {
		PageHelper.startPage(page, rows);
		return userMapper.findUserList();
	}

}
