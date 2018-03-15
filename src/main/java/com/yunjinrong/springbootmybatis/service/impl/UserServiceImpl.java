package com.yunjinrong.springbootmybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
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
@CacheConfig(cacheNames="userCache")
public class UserServiceImpl implements UserService {

	@Autowired
    private UserMapper userMapper;
	
	@Override
	public String selectAgeByName(String name) {
		return userMapper.selectAgeByName(name);
	}

	@Override
	//@CachePut缓存新增的或更新的数据到缓存,其中缓存名字是 people 。数据的key是person的id
    @CachePut(key = "#p0.id")
	public User insertUser(User user) {
		userMapper.insert(user);
		return user;
	}

	@Override
	//@CacheEvict 从缓存people中删除key为id 的数据
    @CacheEvict(key = "#p0")
	public int deleteUser(String id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	//@CachePut缓存新增的或更新的数据到缓存,其中缓存名字是 people 。数据的key是person的id
    @CachePut(key = "#p0.id")
	public User updateUserById(User user) {
		userMapper.updateByPrimaryKey(user);
		return user;
	}

	@Override
	//@Cacheable缓存key为person 的id 数据到缓存people 中,如果没有指定key则方法参数作为key保存到缓存中。
    @Cacheable(key = "#p0")
	public User fingUserById(String id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public Page<User> findUserList(int page, int rows) {
		PageHelper.startPage(page, rows);
		return userMapper.findUserList();
	}

}
