package com.ll.bean;

public class Student {
	
	private int Id; //序列号
	private String Student_Id; //学号
	private String Name; //姓名
	private String Student_Class; //班级
	private String Sex; //性别
	private String Password; //密码
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getStudent_Id() {
		return Student_Id;
	}
	public void setStudent_Id(String student_Id) {
		Student_Id = student_Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String getStudent_Class() {
		return Student_Class;
	}
	public void setStudent_Class(String student_Class) {
		Student_Class = student_Class;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	

}
