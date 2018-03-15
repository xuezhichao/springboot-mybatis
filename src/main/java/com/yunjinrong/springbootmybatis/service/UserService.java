package com.yunjinrong.springbootmybatis.service;

import com.github.pagehelper.Page;
import com.yunjinrong.springbootmybatis.model.User;

public interface UserService {
	/**
	 * <p>Title: selectAgeByName</p>
	 * <p>Description:测试接口 </p>
	 * @param name
	 * @return
	 */
	String selectAgeByName(String name);// 根据姓名读取年龄
	/**
	 * <p>Title: insertUser</p>
	 * <p>Description: 用户新增</p>
	 * @param user
	 * @return
	 */
	public User insertUser(User user);
	/**
	 * <p>Title: deleteUser</p>
	 * <p>Description: 用户删除</p>
	 * @param id
	 * @return
	 */
	public int deleteUser(String id);
	/**
	 * <p>Title: updateUserById</p>
	 * <p>Description: 用户修改</p>
	 * @param user
	 * @return
	 */
	public User updateUserById(User user);
	/**
	 * <p>Title: fingUserById</p>
	 * <p>Description: 根据用户主键查询用户信息</p>
	 * @param id
	 * @return
	 */
	public User fingUserById(String id);
	/**
	 * <p>Title: findUserList</p>
	 * <p>Description: 分页查询</p>
	 * @param page
	 * @param rows
	 * @return
	 */
	public Page<User> findUserList(int page,int rows);
}
