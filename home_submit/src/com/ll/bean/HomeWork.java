package com.ll.bean;

import java.util.Date;

public class HomeWork {
	private int HomeWork_id;
	private String Name;
	private String Description;
	private Date Start_time;
	private Date End_time;
	
	public int getHomeWork_id() {
		return HomeWork_id;
	}
	public void setHomeWork_id(int homeWork_id) {
		HomeWork_id = homeWork_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Date getStart_time() {
		return Start_time;
	}
	public void setStart_time(Date start_time) {
		Start_time = start_time;
	}
	public Date getEnd_time() {
		return End_time;
	}
	public void setEnd_time(Date end_time) {
		End_time = end_time;
	}
	
	
	
	

}
