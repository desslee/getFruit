/**   
* @Title: Category.java
* @Package com.get.fruit.bean 
* @Description: TODO
* @author LiQinglin 
* @date 2015-8-13 ����9:48:38 
* @version V1.0   
*/
package com.get.fruit.bean;

/** 
 * @ClassName: Category 
 * @Description: TODO
 * @author LiQinglin
 * @date 2015-8-13 ����9:48:38 
 *  
 */

public class Category {
	private String categoryName;
	private String[] functions;
	private Taste taste;
	
	
	
	public Taste getTaste() {
		return taste;
	}
	public void setTaste(Taste taste) {
		this.taste = taste;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String[] getFunctions() {
		return functions;
	}
	public void setFunctions(String[] functions) {
		this.functions = functions;
	}
	public Category(String categoryName, String[] functions,Taste taste) {
		super();
		this.categoryName = categoryName;
		this.functions = functions;
		this.taste=taste;
	}
	
	public Category() {
		super();
	}
	
	
	
	public enum Taste{
	
		�����,�����,С����,�ؿ�ζ;
		
	}
	
	/*public enum Taste {

		SOUR("�����"), SWEET("�����"), LIGHT("С����"), STRONG("�ؿ�ζ");
		
		private String describeString;
		private Taste(String taste) {
			// TODO Auto-generated constructor stub
			this.describeString=taste;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.describeString;
		}
	}*/

}
