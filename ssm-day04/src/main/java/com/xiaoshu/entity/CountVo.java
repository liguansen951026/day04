package com.xiaoshu.entity;

public class CountVo {

	private String categoryname;
	private Integer num;
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "CountVo [categoryname=" + categoryname + ", num=" + num + "]";
	}
	
	
}
