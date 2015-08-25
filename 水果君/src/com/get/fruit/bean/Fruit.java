package com.get.fruit.bean;

import java.io.Serializable;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobFile;

public class Fruit extends BmobObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String number,describe,origin;//���,����,����
	private CategoryName categoryName;//��������
	private Color color;//��ɫ
	private Season season;//����
	private FruitShop shop;//�����̵�
	private float price;//�۸�
	private double count;//����
	private Integer favorite;//�ղ���
	private BmobFile picture;//��ͼ
	private BmobFile[] pictures;//��ͼ����ѡ��
	
	
	


	
	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public CategoryName getCategoryName() {
		return categoryName;
	}



	public void setCategoryName(CategoryName categoryName) {
		this.categoryName = categoryName;
	}



	public Color getColor() {
		return color;
	}



	public void setColor(Color color) {
		this.color = color;
	}



	public Season getSeason() {
		return season;
	}



	public void setSeason(Season season) {
		this.season = season;
	}



	public String getOrigin() {
		return origin;
	}



	public void setOrigin(String origin) {
		this.origin = origin;
	}



	public String getDescribe() {
		return describe;
	}



	public void setDescribe(String describe) {
		this.describe = describe;
	}




	public FruitShop getShop() {
		return shop;
	}



	public void setShop(FruitShop shop) {
		this.shop = shop;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}



	public double getCount() {
		return count;
	}



	public void setCount(double count) {
		this.count = count;
	}



	public Integer getFavorite() {
		return favorite;
	}



	public void setFavorite(Integer favorite) {
		this.favorite = favorite;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public BmobFile getPicture() {
		return picture;
	}



	public void setPicture(BmobFile picture) {
		this.picture = picture;
	}



	public BmobFile[] getPictures() {
		return pictures;
	}



	public void setPictures(BmobFile[] pictures) {
		this.pictures = pictures;
	}

	
	
	
	
	
	
	
	
	
	
	
	public enum Season{
		
		����, ����, ����, ����
	}
	
	public enum Color{
		
		��, ��, ��, ��, ��, ��, ��, ��
	}
	
	public enum Origin{
		�Ϸ� ,���� ,���� ,����
	}
	
	public enum CategoryName{
		����, ƻ��, ����, ����, ⨺���, ӣ��, ����, ��ݮ, ����, ���ܹ�, ����, ����, ��֦, ��ݮ, ����, ����, ����, ������, ʯ��, �㽶, ľ��, ��, ��ݮ, ��, â��, ��, ɽ��;
	}

}
