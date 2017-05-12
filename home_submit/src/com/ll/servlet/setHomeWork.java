package com.ll.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ll.bean.HomeWork;
import com.ll.dao.HomeWorkDao;

public class setHomeWork extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		HomeWork homeWork = new HomeWork();
		String name = request.getParameter("name");
		System.out.println(name);
		String description = request.getParameter("description");
		System.out.println(description);
		
		String get_start_time = request.getParameter("start_time");
		System.out.println(get_start_time);
		char[] arr1 = get_start_time.toCharArray();
		arr1[10] = ' ';
		System.out.println(arr1);
		get_start_time = String.valueOf(arr1);
		System.out.println(get_start_time);
		
		String get_end_time = request.getParameter("end_time");
		System.out.println(get_end_time);
		char[] arr2 = get_end_time.toCharArray();
		arr2[10] = ' ';
		get_end_time = String.valueOf(arr2);
		System.out.println(get_end_time);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date start_time = null;
		try {
			start_time = sdf.parse(get_start_time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date end_time = null;
		try {
			end_time = sdf.parse(get_end_time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		homeWork.setName(name);
		homeWork.setDescription(description);
		homeWork.setStart_time(start_time);
		homeWork.setEnd_time(end_time);
		HomeWorkDao homeworkDao = new HomeWorkDao();
		homeworkDao.setHomeWork(homeWork);
        
		request.getRequestDispatcher("/WorkList.action").forward(request,response);
		
//		PrintWriter out = response.getWriter();
//		out.write(setWork);
//		out.close();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
