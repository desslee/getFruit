/**   
* @Title: Fruiterer.java
* @Package com.get.fruit.bean 
* @Description: TODO
* @author LiQinglin 
* @date 2015-8-1 ����4:19:17 
* @version V1.0   
*/
package com.get.fruit.bean;

import java.io.Serializable;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobGeoPoint;

/** 
 * @ClassName: Fruiterer 
 * @Description: TODO
 * @author LiQinglin
 * @date 2015-8-1 ����4:19:17 
 *  
 */
public class FruitShop extends BmobObject implements Serializable{
	
	/** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long serialVersionUID = 7028325953020366321L;
	
	private String name,address;//��������ַ��ʡ-��-�أ�
	private User owner;//�ϰ�
	private Integer rank ; //�ȼ�
	private double  sale;  //����
	private BmobGeoPoint location;//��������
	
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSale() {
		return sale;
	}
	public void setSale(double sale) {
		this.sale = sale;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public BmobGeoPoint getLocation() {
		return location;
	}
	public void setLocation(BmobGeoPoint location) {
		this.location = location;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
