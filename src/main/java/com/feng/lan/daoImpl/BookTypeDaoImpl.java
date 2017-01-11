package com.feng.lan.daoImpl;

import com.feng.lan.dao.BookTypeDao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.feng.lan.entities.BookType;
import com.feng.lan.map.MyBatisUtil;
public class BookTypeDaoImpl implements BookTypeDao {
	  @Override
	  public List<BookType> getAllBookTypes() {
	    //获得会话对象
	    SqlSession session=MyBatisUtil.getSession();
	    try {
	      //通过MyBatis实现接口BookTypeDAO，返回实例
	     BookTypeDao bookTypeDAO=session.getMapper(BookTypeDao.class);
	     // session.selectList("com.feng.lan.dao.BookTypeDao.getAllBookTypes",BookType.class);
	     return bookTypeDAO.getAllBookTypes();
	    } finally {
	      session.close();
	    }
	  }
}
