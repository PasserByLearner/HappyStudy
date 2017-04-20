package com.ll.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ll.bean.HomeWork;
import com.ll.db.DBAccess;

public class HomeWorkDao {
	
	public List<HomeWork> queryHomeWorkList(String homework_id, String name){
		DBAccess dbAcess = new DBAccess();
		List<HomeWork> homeWorkList = new ArrayList<HomeWork>();
		SqlSession sqlSession = null;
		try{
			sqlSession = dbAcess.getSqlSession();
		    homeWorkList = sqlSession.selectList("HomeWork.queryHomeWorkList");
		}catch(IOException e){
		    e.printStackTrace();
		}finally {
			if(sqlSession != null)
			sqlSession.close();
		}
	    return homeWorkList; 
	 }
	public static void main(String[] args) {
		 HomeWorkDao studentDao = new HomeWorkDao();
		 List<HomeWork> list = studentDao.queryHomeWorkList("", "");
		 System.out.println(list.size());
		
	}

}
