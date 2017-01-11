package com.feng.lan.daoImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.feng.lan.dao.IUserInfoDao;
import com.feng.lan.entities.vo.UserInfo;
import com.feng.lan.map.MyBatisUtil;

public class UserInfoDaoImpl implements IUserInfoDao {

	@Override
	public UserInfo getUserInfo(String userName,String password) {
		SqlSession sqlSession = MyBatisUtil.getSession();
		try{
			IUserInfoDao user = sqlSession.getMapper(IUserInfoDao.class);
			 return user.getUserInfo(userName,password);
		}
		finally{
			sqlSession.close();
		}
	}

	@Override
	public void insertUserInfo(UserInfo user) {
		SqlSession sqlSession = MyBatisUtil.getSession();
		try{
			IUserInfoDao userDao = sqlSession.getMapper(IUserInfoDao.class);
			userDao.insertUserInfo(user);
		}
		finally{
			sqlSession.close();
		}
	}

	@Override
	public void deleteUserInfo(UserInfo user) {
		SqlSession sqlSession = MyBatisUtil.getSession();
		try{
			IUserInfoDao userDao = sqlSession.getMapper(IUserInfoDao.class);
			userDao.deleteUserInfo(user);
		}
		finally{
			sqlSession.close();
		}
	}

	@Override
	public void updateUserInfo(UserInfo user) {
		SqlSession sqlSession = MyBatisUtil.getSession();
		try{
			IUserInfoDao userDao = sqlSession.getMapper(IUserInfoDao.class);
			userDao.updateUserInfo(user);
		}
		finally{
			sqlSession.close();
		}
	}

	@Override
	public List<UserInfo> getAllUserInfo() {
		SqlSession sqlSession=MyBatisUtil.getSession();
	    try {
	    	sqlSession.selectList("com.feng.lan.dao.IUserInfoDao.getAllUserInfo", UserInfo.class);
	    }finally{
	    	sqlSession.close();
	    }
		return null;
	}

}
