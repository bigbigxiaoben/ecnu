package com.feng.lan.dao;

import java.util.List;

import com.feng.lan.entities.BookType;

/** 图书类型数
 * 据访问接口*/

public interface BookTypeDao {

	public List<BookType> getAllBookTypes();
}
