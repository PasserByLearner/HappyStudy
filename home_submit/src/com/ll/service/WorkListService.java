package com.ll.service;

import java.util.List;

import com.ll.bean.HomeWork;
import com.ll.bean.Student;
import com.ll.dao.HomeWorkDao;
import com.ll.dao.StudentDao;

public class WorkListService {
	public List<HomeWork> queryHomeworkList(String homework_id){
	     HomeWorkDao homeworkDao = new HomeWorkDao();
		return homeworkDao.queryHomeWorkList(homework_id);
	}
}
