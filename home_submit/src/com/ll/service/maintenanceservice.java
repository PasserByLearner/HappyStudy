package com.ll.service;

import java.util.ArrayList;
import java.util.List;

import com.ll.bean.Student;
import com.ll.dao.StudentDao;

public class maintenanceservice {

	public maintenanceservice() {
		// TODO Auto-generated constructor stub
	}
	public boolean studentregister(Student s){
		String id =s.getStudent_Id();
		
	     StudentDao studentDao = new StudentDao();
		List<Student> list = studentDao.queryStudentListbystudentid(id);
		if(list.isEmpty()){
			studentDao.studentresgister(s);
			return true;
		}
		else{
		return false;}
	}


}
