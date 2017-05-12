package com.ll.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ll.bean.HomeWork;
import com.ll.db.DBAccess;

public class HomeWorkDao {
	
	public List<HomeWork> queryHomeWorkList(String homework_id){
		DBAccess dbAcess = new DBAccess();
		List<HomeWork> homeWorkList = new ArrayList<HomeWork>();
		SqlSession sqlSession = null;
		try{
			sqlSession = dbAcess.getSqlSession();
		    homeWorkList = sqlSession.selectList("HomeWork.queryHomeWorkList",homework_id);
		}catch(IOException e){
		    e.printStackTrace();
		}finally {
			if(sqlSession != null)
			sqlSession.close();
		}
	    return homeWorkList; 
	 }
	public void setHomeWork(HomeWork homeWork){
		DBAccess dbAccess = new DBAccess();
		System.out.println("start in");
		SqlSession sqlSession = null;
		try{
			sqlSession = dbAccess.getSqlSession();
			sqlSession.insert("HomeWork.setHomeWork", homeWork);
			sqlSession.commit();
		} catch(IOException e){
			e.printStackTrace();
		} finally {
			if (sqlSession != null)
			sqlSession.close();
		}
		return;
	}

}
