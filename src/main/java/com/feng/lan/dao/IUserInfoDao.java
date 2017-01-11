package com.feng.lan.dao;

import java.util.List;

import com.feng.lan.entities.vo.UserInfo;

public interface IUserInfoDao {

	/**
	 * 根据用户名获得用户信息
	 */
	public UserInfo getUserInfo(String userName,String password);
	/**
	 * 查询所有用户信息
	 */
	public List<UserInfo> getAllUserInfo();
	/**
	 * 插入用户信息
	 */
	public void insertUserInfo(UserInfo user);
	/**
	 * 删除用户信息
	 */
	public void deleteUserInfo(UserInfo user);
	/**
	 * 根据用户名称修改用户信息
	 */
	public void updateUserInfo(UserInfo user);
}
