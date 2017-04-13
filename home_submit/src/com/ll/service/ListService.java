package com.ll.service;

import java.util.List;

import com.ll.bean.Student;
import com.ll.dao.StudentDao;

public class ListService {
	public List<Student> queryStudentList(String studnet_id, String name){
	     StudentDao studentDao = new StudentDao();
		return studentDao.queryStudentList(studnet_id, name);
	}

}
