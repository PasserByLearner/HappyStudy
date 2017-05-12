package com.ll.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ll.bean.HomeWork;
import com.ll.bean.Student;
import com.ll.service.ListService;
import com.ll.service.WorkListService;

/**
 * Servlet implementation class WorkListServlet
 */
@WebServlet("/WorkListServlet")
public class WorkListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session=request.getSession();
		 System.out.println(session.getAttribute("name"));
		WorkListService service = new WorkListService();
		List<HomeWork> list = new ArrayList<>();
		list = service.queryHomeworkList("");
	    request.setAttribute("homeworkList", list);
		request.getRequestDispatcher("/WEB-INF/jsp/main.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
