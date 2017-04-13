package com.ll.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ll.bean.Student;
import com.ll.db.DBAccess;

public class StudentDao {
	
	public List<Student> queryStudentList(String studnet_id, String name){
		DBAccess dbAcess = new DBAccess();
		List<Student> studentList = new ArrayList<Student>();
		SqlSession sqlSession = null;
		try{
			sqlSession = dbAcess.getSqlSession();
		    studentList = sqlSession.selectList("Student.queryStudentList");
		}catch(IOException e){
		    e.printStackTrace();
		}finally {
			if(sqlSession != null)
			sqlSession.close();
		}
	    return studentList; 
	 }

}
