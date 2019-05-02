package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Category
{
	@Id
	@GeneratedValue
  int categoryid;
  String CategoryName;
  String CategoryDesc;
  
public int getCategoryid() {
	return categoryid;
}
public void setCategoryid(int categoryid) {
	this.categoryid = categoryid;
}
public String getCategoryName() {
	return CategoryName;
}
public void setCategoryName(String categoryName) {
	CategoryName = categoryName;
}
public String getCategoryDesc() {
	return CategoryDesc;
}
public void setCategoryDesc(String categoryDesc) {
	CategoryDesc = categoryDesc;
}
  
  
  
}
