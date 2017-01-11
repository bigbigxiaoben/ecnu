package com.feng.lan.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 图书类型
 * @author zhouhuiying
 *
 */
@Entity(name = "booktypes")
public class BookType {

	/**类型编号*/
	private int id;
	
	/**类型名称*/
	private String typeName;
	
	/**
	 * @return the id
	 * */
	@Column(name = "id")
	public int getId() {
		return id;
	}
	/** Param id
	 *  the id to set*/
	public void setId(int id) {
		this.id = id;
	}
	/** 
	 * @return typeName 
	 */
	@Column(name = "type_name")
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	
}
