package com.saurabh.bean;

public class StudentBean implements java.io.Serializable {

	//memeber variable
	
	
	private String name;
	private int id;
	private String course;
	private int roll;
	
	
	//setter method to set the value
	public void setName(String name) {
		this.name=name;
	}
	
	//setter method to use the value
	
	public String getName() {
		return name;
	}
	
	
	
	public void setId(int id){
		this.id= id;
	}
	
	public int getId() {
		return id;
	}

}
