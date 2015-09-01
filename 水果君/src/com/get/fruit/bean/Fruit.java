package com.get.fruit.bean;

import java.io.Serializable;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobFile;
import cn.bmob.v3.datatype.BmobRelation;

public class Fruit extends BmobObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String number,name,describe,origin;//���,����,����
	private Category category;//��������
	private Color color;//��ɫ
	private Season season;//����
	private FruitShop shop;//�����̵�
	private float price;//�۸�
	private double count;//����
	private Integer paynum;//����������ֱ��д��ʵ�壬���ٲ�ѯ��
	private BmobRelation likes;//�ղص��û�
	private BmobFile picture;//��ͼ(filename)
	private String[] pictures;//��ͼ����ѡ��
	
	
	

	

	
	public Fruit(FruitShop shop) {
		this.shop = shop;
	}



	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
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



	


	public Integer getPaynum() {
		return paynum;
	}




	public void setPaynum(Integer paynum) {
		this.paynum = paynum;
	}




	public BmobRelation getLikes() {
		return likes;
	}



	public void setLikes(BmobRelation likes) {
		this.likes = likes;
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



	public String[] getPictures() {
		return pictures;
	}



	public void setPictures(String[] pictures) {
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

}
