package com.feng.lan.ecnu.daoImpl;

import java.util.List;

import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;
import com.feng.lan.daoImpl.BookTypeDaoImpl;
import com.feng.lan.entities.BookType;

public class TestBookTypeDaoImpl {

	BookTypeDaoImpl bookTypeDaoImpl =new BookTypeDaoImpl();
	@Test
	public void testGetAllBookTypes(){
		System.out.println("start");
		List<BookType> bookTypeList = bookTypeDaoImpl.getAllBookTypes();
		for(BookType bookType:bookTypeList){
			System.out.println(JSON.toJSONString(bookType));
		}
		System.out.println("end");
	}
}
