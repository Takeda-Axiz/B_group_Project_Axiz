package jp.co.axiz.entity;

public class Category {
	/*---  Field  ---*/
	private Integer categoryId;		//変数名概要
	private String categoryName;		//変数名概要

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public Category() {

	}

	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	//  処理概要
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/*---  Method End  ---*/
}
