package com.ll.service;

import java.util.List;

import com.ll.bean.Student;
import com.ll.dao.StudentDao;

public class ListService {
	public List<Student> queryStudentList(String studnet_id, String name){
	     StudentDao studentDao = new StudentDao();
		return studentDao.queryStudentList(studnet_id, name);
	}
	public List<Student> studentsignin(String studnet_id, String password){
		Student student = new Student();
		student.setStudent_Id(studnet_id);
		student.setPassword(password);
	     StudentDao studentDao = new StudentDao();
		List<Student> list = studentDao.studentsignin(student);
		
		return list;
	}

}
